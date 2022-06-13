import java.text.NumberFormat;
import java.util.Locale;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale localeBR = new Locale("pt","BR");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(localeBR);
        System.out.println("Valor: " + moeda.format(valor) + "\n" + "Taxa: " + String.format("%.2f", taxa) + "%");
        System.out.println();
    }
}
