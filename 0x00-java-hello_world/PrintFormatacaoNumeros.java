import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;

        String valorMonetario = NumberFormat.getCurrencyInstance().format(valor).replace("$", "R$ ");

        System.out.printf("Valor: %s\nTaxa: %.2f%%\n", valorMonetario, taxa);

        //Outra solução:
        Locale localeBR = new Locale("pt","BR");
        NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
        NumberFormat moeda = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("Valor: " + moeda.format(valor) + "\n" + "Taxa: " + percentual.format(taxa));

    }

}
