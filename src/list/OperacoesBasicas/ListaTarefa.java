package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefalist) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);

            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefalist.size();
    }

    public void obterDescricoesTarefas(){
        for (Tarefa t: tarefalist) {
            System.out.println(t.getDescricao());
        }
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        lista.adicionaTarefa("Estudar Java");
        lista.adicionaTarefa("Fazer compras");
        lista.adicionaTarefa("Lavar o carro");

        System.out.println("Número total de tarefas: " + lista.obterNumeroTotalTarefas());

        System.out.println("Descrições das tarefas:");
        lista.obterDescricoesTarefas();

        lista.removerTarefa("Fazer compras");
        System.out.println("Número total de tarefas após remoção: " + lista.obterNumeroTotalTarefas());
    }

}
