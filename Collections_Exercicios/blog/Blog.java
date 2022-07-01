import java.util.*;

public class Blog {
    private List<Post> postagens = new ArrayList<>();

    public void adicionarPostagem( Post postagem){
        this.postagens.add(postagem);
    }

    public Set<String> obterTodosAutores(){

        List<String> autoresDuplicados = new ArrayList<>();
        for(Post postagem: postagens){
            autoresDuplicados.add(postagem.getAutor());
        }
        Collections.sort(autoresDuplicados);
        Set<String> autores = new TreeSet<>(autoresDuplicados);
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> contagemDePostagemPorCategoria = new TreeMap<String, Integer>();
        Integer totalPostagem = 0;
        for(Post postagem: postagens){
            for(Post post: postagens){
                if(postagem.getCategoria().equals(post.getCategoria())){
                    totalPostagem++;
                }
            }
            contagemDePostagemPorCategoria.put(postagem.getCategoria(),totalPostagem);
            totalPostagem = 0;
        }
        return contagemDePostagemPorCategoria;
    }
}
