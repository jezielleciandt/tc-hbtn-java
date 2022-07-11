import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro filtro){
        List<Produto> produtosFiltrados = new ArrayList<>();
        for(Produto produto: produtos){
            if(filtro.testar(produto)){
                produtosFiltrados.add(produto);
            }
        }
        return produtosFiltrados;
    }
}
