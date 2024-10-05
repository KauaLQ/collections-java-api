package map.GerenciadorContatos;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
        JOptionPane.showMessageDialog(null, "Novo contato adicionado!", "Informe", JOptionPane.INFORMATION_MESSAGE);
    }

    public void removerContatos(String nome){
        if (!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
            JOptionPane.showMessageDialog(null, "O contato " + nome + " foi removido com sucesso!", "Informe", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum contato salvo", "Informe", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void exibirContatos(){
        JOptionPane.showMessageDialog(null, agendaContatosMap, "Contatos Salvos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
            JOptionPane.showMessageDialog(null, "O número do contato " + nome + " é: " + numeroPorNome + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum contato salvo", "Informe", JOptionPane.ERROR_MESSAGE);
        }
    }
}
