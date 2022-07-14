import java.io.Serializable;

public class Estudante implements Serializable {

    private static final long serialVersionUID = -7375107260039283791L;
    private int idade;
    private String nome;
    private String senha;

    //transient - para atributos que não se deseja serializar

    public Estudante(int idade, String nome, String senha) {
        this.idade = idade;
        this.nome = nome;
        this.senha = senha;
    }

    public Estudante() {
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return String.format("Estudante { nome='%s', idade='%s', senha='%s' }", nome,idade,senha);
    }
}
