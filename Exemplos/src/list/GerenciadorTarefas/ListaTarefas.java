package list.GerenciadorTarefas;

import java.util.*;
import javax.swing.*;
public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
        JOptionPane.showMessageDialog(null, "Nova tarefa adicionada", "Informe", JOptionPane.INFORMATION_MESSAGE);
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
        JOptionPane.showMessageDialog(null, "Tarefa(s) removida(s)", "Informe", JOptionPane.INFORMATION_MESSAGE);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        JOptionPane.showMessageDialog(null, tarefaList, "Tarefas Cadastradas", JOptionPane.INFORMATION_MESSAGE);
    }
}
