package tpc5.exercicio13;
import tpc5.exercicio12.tarefa;
import java.util.ArrayList;
import java.util.Date;


public class Collection {
    private final ArrayList<tarefa> tarefas;

    public Collection() {
        this.tarefas = new ArrayList<>();
    }

    public void addTarefa(tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removeTarefa(tarefa tarefa) {
        this.tarefas.remove(tarefa);
    }

    public void atualizaTarefa(tarefa tarefa, String descricao, Date data) {
        tarefa.setDescricao(descricao);
        tarefa.setData(data);
    }

    public void listaTarefas(Date data) {
        System.out.println("Tarefas para a data " + data + ":");
        for (tpc5.exercicio12.tarefa tarefa : this.tarefas) {
            if (tarefa.ocorreEm(data)) {
                System.out.println(tarefa.getDescricao());
            }
        }
    }
}
