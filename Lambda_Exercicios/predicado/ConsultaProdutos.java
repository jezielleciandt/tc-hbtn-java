import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> filtro){
        List<Produto> produtosFiltrados = new ArrayList<>();
        for(Produto produto: produtos){
            if(filtro.test(produto)){
                produtosFiltrados.add(produto);
            }
        }
        return produtosFiltrados;
    }
}
