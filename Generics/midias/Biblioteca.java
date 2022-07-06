import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {
    private List<T> lista= new ArrayList<>();

    public Biblioteca(List<T> lista) {
        this.lista = lista;
    }

    public Biblioteca() {
    }

    public void adicionarMidia(T midia){
        lista.add(midia);
    }

    public List<?> obterListaMidias(){
        return lista;
    }
}
