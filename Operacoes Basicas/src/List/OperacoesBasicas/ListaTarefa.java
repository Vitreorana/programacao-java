package List.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    //**para adicionar métodos na classe lista de tarefas acima
    //
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    //**para remover elementos da lista que possuem descricao igual a que eu coloquei em "String descricao" */
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); 
        for(Tarefa t : tarefaList){ //**vou passar por dentro de cada tarefa list */
            if(t.getDescricao().equalsIgnoreCase(descricao)); {//**se a descricao  for igual a descricao que eu passei acima no método, remover tarefa*/
                tarefasParaRemover.add(t); //** eu vou adicionar essa tarefa t */
            }
        }
        tarefaList.removeAll(tarefasParaRemover); //** remover toda a lista de tarefas que esta em tarefasParaRemover*/
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
