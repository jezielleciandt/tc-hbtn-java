public class Livro extends Midia{
    private int edicao;

    public Livro(String nome, int edicao) {
        super(nome);
        this.edicao = edicao;
    }

    public Livro(int edicao) {
        this.edicao = edicao;
    }

    public Livro() {
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
