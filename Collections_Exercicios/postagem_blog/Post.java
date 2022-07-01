import java.util.Objects;

public class Post implements Comparable<Post> {

    private Autor autor;
    private String titulo;
    private String corpo;

    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Post() {
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(autor, post.autor) && Objects.equals(titulo, post.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, titulo);
    }

    @Override
    public String toString() {
        return getTitulo();
    }

    @Override
    public int compareTo(Post postagem) {
        return this.titulo.compareTo(postagem.getTitulo());

    }

}
