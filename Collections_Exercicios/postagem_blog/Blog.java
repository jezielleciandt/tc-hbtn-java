import java.util.*;

public class Blog {
    private List<Post> postagens = new ArrayList<>();

    public void adicionarPostagem( Post postagem){
        if(postagens.contains(postagem)){
            throw new IllegalArgumentException("Postagem jah existente");
        }
        this.postagens.add(postagem);
    }

    public Set<Autor> obterTodosAutores(){

        Set<Autor> autores = new TreeSet<>();
        for(Post postagem: postagens){
            autores.add(postagem.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> contagemDePostagemPorCategoria = new TreeMap<Categorias, Integer>();
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

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> postagensPorAutor = new TreeSet<>();

        for(Post postagem: postagens){
            if(postagem.getAutor().equals(autor)){
                postagensPorAutor.add(postagem);
            }
        }
        return postagensPorAutor;
    }
    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> postagensPorCategoria = new TreeSet<>();

        for(Post postagem: postagens){
            if(postagem.getCategoria().equals(categoria)){
                postagensPorCategoria.add(postagem);
            }
        }
        return postagensPorCategoria;
    }

    public Map<Categorias,Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> postagensPorCategoria = new TreeMap<>();

       for(Post postagem: postagens){
           if(postagensPorCategoria.containsKey(postagem.getCategoria())){
               Set<Post> listaPostagem = postagensPorCategoria.get(postagem.getCategoria());
               listaPostagem.add(postagem);
               postagensPorCategoria.put(postagem.getCategoria(), listaPostagem);
           }else{
               Set<Post> listaPostagem = new TreeSet<>();
               listaPostagem.add(postagem);
               postagensPorCategoria.put(postagem.getCategoria(), listaPostagem);
           }
       }
        return postagensPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> postagensPorAutor = new TreeMap<>();

        for(Post postagem: postagens){
            if(postagensPorAutor.containsKey(postagem.getAutor())){
                Set<Post> listaPostagem = postagensPorAutor.get(postagem.getAutor());
                listaPostagem.add(postagem);
                postagensPorAutor.put(postagem.getAutor(), listaPostagem);
            }else{
                Set<Post> listaPostagem = new TreeSet<>();
                listaPostagem.add(postagem);
                postagensPorAutor.put(postagem.getAutor(), listaPostagem);
            }
        }

        return postagensPorAutor;
    }
}
