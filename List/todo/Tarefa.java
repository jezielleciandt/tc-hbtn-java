public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) throws Exception {
        modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void modificarDescricao(String novaDescricao) throws Exception {
        if(novaDescricao.isBlank() || novaDescricao == null){
            throw new Exception("Descricao de tarefa invalida");
        }else {
            setDescricao(novaDescricao);
        }
    }
}
