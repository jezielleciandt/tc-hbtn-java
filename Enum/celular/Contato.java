public class Contato {

    private String nome;
    private String numeroTelefone;
    private TipoNumero tipoNumero;


    public Contato(String nome, String numero, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numeroTelefone = numero;
        this.tipoNumero = tipoNumero;
    }

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numeroTelefone;
    }

    public void setNumero(String numero) {
        this.numeroTelefone = numero;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }

    @Override
    public String toString() {
        return nome + " -> " + numeroTelefone + " (" + tipoNumero + ")";
    }
}
