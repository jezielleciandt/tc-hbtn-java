import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    Supplier<Double> precoComMarkup = () -> getPreco() + (this.preco*percentualMarkup/100);

    Consumer<Double> atualizarMarkup = (p) -> percentualMarkup = p;
}
