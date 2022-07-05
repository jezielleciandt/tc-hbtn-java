import atividades.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    private List<Atividade> atividades = new ArrayList<>();

    public Workflow(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public Workflow() {
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void registrarAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }
}
