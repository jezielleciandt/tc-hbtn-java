import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, double transacaoInicial) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
        transacoes.add(transacaoInicial);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valorTransacao) {
        transacoes.add(valorTransacao);
    }

    public void listaDados(boolean imprimeTransacoes, int indiceCliente) {
        System.out.printf("Cliente: %s [%d]\n", getNome(), indiceCliente + 1);
        if (imprimeTransacoes) {
            for (Double transacao : transacoes) {
                System.out.printf("  [%d] valor %.2f\n", transacoes.indexOf(transacao) + 1, transacao);
            }
        }
    }
}

