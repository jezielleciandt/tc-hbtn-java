import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale localeBR = new Locale("en ","BR");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(localeBR);
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.err.print("Valor: " + moeda.format(valor) + "\n");
        System.err.println("Taxa: " + formatter.format(taxa).concat("%"));
        System.out.println();
    }
}
