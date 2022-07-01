import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeCliente, double valorInicial) {
        return clientes.add(new Cliente(nomeCliente,valorInicial));
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTrans) {
        for(Cliente cliente : clientes) {
            if(cliente.getNome().equals(nomeCliente)) {
                cliente.adicionarTransacao(valorTrans);
                return true;
            }
        }
        return false;
    }

    public Cliente buscarCliente(String nomeCliente){
        Cliente clienteVerificado = null;
        for(Cliente cliente: clientes){
            if(cliente.getNome().equals(nomeCliente)){
                clienteVerificado = cliente;
            }
        }
        return clienteVerificado;
    }
}
