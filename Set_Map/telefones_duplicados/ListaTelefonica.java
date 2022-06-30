import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> agenda = new HashMap<>();

    public ListaTelefonica(HashMap<String, HashSet<Telefone>> telefones) {
        this.agenda = telefones;
    }

    public ListaTelefonica() {
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> telefones = new HashSet<>();
        if (this.agenda.containsKey(nome)) {
            if (this.agenda.get(nome).contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }

            else {
                List<String> nomes = new ArrayList<>(agenda.keySet());
                for(String contato : nomes){
                    if (this.agenda.get(contato).contains(telefone)) {
                        throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                    }
                }
                this.agenda.get(nome).add(telefone);
            }
        } else {
            telefones.add(telefone);
            this.agenda.put(nome, telefones);
        }
        return telefones;
    }

    public HashSet<Telefone> buscar(String nome) {

        return this.agenda.containsKey(nome) ? this.agenda.get(nome) : null;
    }
}
