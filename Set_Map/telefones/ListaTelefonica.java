import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> agenda =  new HashMap<>();

    public ListaTelefonica(HashMap<String, ArrayList<Telefone>> telefones) {
        this.agenda = telefones;
    }

    public ListaTelefonica() {
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        if(this.agenda.containsKey(nome)){
            this.agenda.get(nome).add(telefone);
        }else{
            ArrayList<Telefone> telefones = new ArrayList<>();
            telefones.add(telefone);
            this.agenda.put(nome, telefones);
        }
    }
    public ArrayList<Telefone> buscar(String nome) {

        return this.agenda.containsKey(nome) ?  this.agenda.get(nome) : null;
    }

}
