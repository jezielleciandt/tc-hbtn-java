import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nomeAgencia){
        Agencia agenciaVerificada = null;
        for(Agencia agencia: agencias){
            if (agencia.getNome().equals(nomeAgencia)) {
                agenciaVerificada = agencia;
            }
        }
        return agenciaVerificada;
    }

    public boolean adicionarAgencia(String nomeAgencia){
        if(buscarAgencia(nomeAgencia) != null){
            return false;
        }
        return agencias.add(new Agencia(nomeAgencia));
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double ValorTransacao){
        if(buscarAgencia(nomeAgencia) == null){
            return false;
        } else if (buscarAgencia(nomeAgencia).buscarCliente(nomeCliente) != null) {
            return false;
        }
        return buscarAgencia(nomeAgencia).getClientes().add(new Cliente(nomeCliente, ValorTransacao));
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double ValorTransacao){
        if(buscarAgencia(nomeAgencia) == null){
            return false;
        } else if (buscarAgencia(nomeAgencia).buscarCliente(nomeCliente) == null) {
            return false;
        }
        return buscarAgencia(nomeAgencia).buscarCliente(nomeCliente).getTransacoes().add(ValorTransacao);
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes){
        if(buscarAgencia(nomeAgencia) == null){
            return false;
        }
        for(Cliente cliente: buscarAgencia(nomeAgencia).getClientes()){
            cliente.listaDados(imprimeTransacoes, buscarAgencia(nomeAgencia).getClientes().indexOf(cliente));
        }
        return true;
    }
}
