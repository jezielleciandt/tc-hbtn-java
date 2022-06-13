import java.text.NumberFormat;
import java.util.Locale;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale localeBR = new Locale("pt","BR");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(localeBR);
        NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
        System.out.println("Valor: " + moeda.format(valor) + "\n" + "Taxa: " + percentual.format(taxa));
        System.out.println();
    }
}
