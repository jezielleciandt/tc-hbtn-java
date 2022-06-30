import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros){

        HashSet<Integer> numLista = new HashSet<Integer>();

        TreeSet<Integer> numerosOrdenados = new TreeSet<Integer>();

        for(int numero : numeros){
            if(!numLista.add(numero)){
                numerosOrdenados.add(numero);
            }
        }
        return numerosOrdenados;
    }
}
