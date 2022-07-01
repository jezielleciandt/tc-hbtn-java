import java.util.ArrayList;
import java.util.Objects;

public class Celular {

    private ArrayList<Contato> contatos = new ArrayList<>();

    public int obterPosicaoContato(String nomeContato){
        for(Contato contato: contatos){
           if(contato.getNome().equals(nomeContato)){
               return contatos.indexOf(contato);
           }
        }
        return -1;
    }

    public void adicionarContato(Contato contato){
        if(obterPosicaoContato(contato.getNome()) != -1){
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }else{
            contatos.add(contato);
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        if(obterPosicaoContato(contatoAntigo.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        } else if (obterPosicaoContato(novoContato.getNome()) != -1 && (!Objects.equals(contatoAntigo.getNome(), novoContato.getNome()))) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        } else{
            contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);
        }
    }

    public void removerContato(Contato contato){
        if(obterPosicaoContato(contato.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }else{
            contatos.remove(obterPosicaoContato(contato.getNome()));
        }
    }

    public void listarContatos(){
        for(Contato contato: contatos){
            System.out.println(contato.toString());
        }
    }
}
