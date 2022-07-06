public class Video extends Midia{
    private int duracao;

    public Video(String nome, int duracao) {
        super(nome);
        this.duracao = duracao;
    }

    public Video(int duracao) {
        this.duracao = duracao;
    }

    public Video() {
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
