import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa novaTarefa) {
        if (tarefaExiste(novaTarefa.getIdentificador())) {
            throw new IllegalArgumentException("Tarefa com identificador " + novaTarefa.getIdentificador() + " ja existente na lista");
        } else {
            this.tarefas.add(novaTarefa);
        }
    }

    public boolean marcarTarefaFeita(int identificadorTarefa) {

        return alteraStatusTarefa(identificadorTarefa, true);
    }

    public boolean desfazerTarefa(int identificadorTarefa) {

        return alteraStatusTarefa(identificadorTarefa, false);
    }

    private boolean alteraStatusTarefa(int identificadorTarefa, boolean status) {
        boolean result = false;
        if (!tarefaExiste(identificadorTarefa)) {
            return result;
        }
        for (int i = 0; i < this.tarefas.size(); i++) {
            if (identificadorTarefa == this.tarefas.get(i).getIdentificador()) {
                this.tarefas.get(i).setEstahFeita(status);
                result = true;
            }
        }
        return result;
    }

    private boolean tarefaExiste(int identificadorTarefa) {
        boolean result = false;
        for (int i = 0; i < this.tarefas.size(); i++) {
            if (identificadorTarefa == this.tarefas.get(i).getIdentificador()) {
                result = true;
            }
        }
        return result;
    }

    public void desfazerTodas() {
        alterasStatusTodasTarefas(false);
    }

    public void fazerTodas() {
        alterasStatusTodasTarefas(true);
    }

    private void alterasStatusTodasTarefas(boolean status) {
        for (Tarefa tarefa : this.tarefas) {
            tarefa.setEstahFeita(status);
        }
    }


    public void listarTarefas() {
        for (Tarefa tarefa : this.tarefas) {

            System.out.printf("[%s]  Id: %s - Descricao: %s\n",
                    tarefa.isEstahFeita() ? "X" : " ",
                    tarefa.getIdentificador(),
                    tarefa.getDescricao());
        }
    }
}

