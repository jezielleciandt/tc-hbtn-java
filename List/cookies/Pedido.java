import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie cookie) {
        this.cookies.add(cookie);
    }

    public int obterTotalCaixas() {
        int totalCaixas = 0;
        for (PedidoCookie cookie : this.cookies) {
            totalCaixas += cookie.getQuantidadeCaixas();
        }
        return totalCaixas;
    }

    public int removerSabor(String sabor) {
        int totalCaixasRemovidas = 0;
        try {
            for (int i = 0; i < cookies.size(); i++) {
                if (sabor.equalsIgnoreCase(cookies.get(i).getSabor())) {
                    totalCaixasRemovidas += cookies.get(i).getQuantidadeCaixas();
                    cookies.remove(i);
                }
            }
        } catch (ConcurrentModificationException e) {
            e.getStackTrace();
        }
        return totalCaixasRemovidas;
    }
}
