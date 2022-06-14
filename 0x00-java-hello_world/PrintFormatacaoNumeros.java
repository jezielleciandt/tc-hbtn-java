import java.text.NumberFormat;
public class PrintFormatacaoNumeros {
     public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;

        String valorMonetario = NumberFormat.getCurrencyInstance().format(valor).replace("$", "R$ ");

        System.out.printf("Valor: %s\nTaxa: %.2f%%\n", valorMonetario, taxa);
    }
}
