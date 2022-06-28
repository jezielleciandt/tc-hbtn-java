import java.util.ArrayList;
import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int numero){
        if(!numeros.contains(numero)){
            return -1;
        }
        return numeros.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> numeros, int numero){
        if(buscarPosicaoNumero(numeros,numero) == -1){
            numeros.add(numero);
        }else {
            throw new RuntimeException("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> numeros, int numero){
        if(!(buscarPosicaoNumero(numeros,numero) == -1)){
            numeros.remove(numeros.indexOf(numero));
        }else {
            throw new RuntimeException("Numero nao encontrado na lista");
        }
    }

    public static  void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto){
        if(buscarPosicaoNumero(numeros,numeroSubstituir) == -1){
            numeros.add(numeroSubstituto);
        }else {
            numeros.set(numeros.indexOf(numeroSubstituir), numeroSubstituto);
        }
    }

}
