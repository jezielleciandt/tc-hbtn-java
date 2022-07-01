import java.util.Objects;

public class Autor implements Comparable<Autor>{
    private String nome, sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Autor() {
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nome, autor.nome) && Objects.equals(sobrenome, autor.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }

    @Override
    public int compareTo(Autor autor) {
        return this.nome.compareTo(autor.getNome());
    }
}
