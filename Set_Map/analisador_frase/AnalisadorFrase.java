import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase){

        String fraseMinuscula = frase.toLowerCase();

        fraseMinuscula = fraseMinuscula.replaceAll("[!.?]","");

        List<String> listaPalavras = List.of(fraseMinuscula.split(" "));

        TreeMap<String, Integer> ocorrencia = new TreeMap<>();

        for(String chave : listaPalavras){
            ocorrencia.put(chave, Collections.frequency(listaPalavras, chave));
        }
        return ocorrencia;
    }
}
