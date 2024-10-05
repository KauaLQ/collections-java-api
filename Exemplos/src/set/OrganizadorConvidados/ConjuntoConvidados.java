package set.OrganizadorConvidados;

import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome, codigoConvidado));
        JOptionPane.showMessageDialog(null, "Novo convidado adicionado!", "Informe", JOptionPane.INFORMATION_MESSAGE);
    }

    public void removerConvidado(int codigoConvidado){
        Convidado convidadoParaRemover = null;
        if(!convidadoSet.isEmpty()){
            for (Convidado c : convidadoSet){
                if (c.getCodigoConvidado() == codigoConvidado){
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
            JOptionPane.showMessageDialog(null, "Convidado de número " + codigoConvidado + " foi removido", "Informe", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Não existem convidados com esse código!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void contarConvidados(){
        int quantidadeConvidados = convidadoSet.size();
        JOptionPane.showMessageDialog(null, "A quantidade de candidatos cadastrados é " + quantidadeConvidados, "Quantidade de Convidados", JOptionPane.INFORMATION_MESSAGE);
    }

    public void exibirConvidados(){
        JOptionPane.showMessageDialog(null, convidadoSet, "Convidaos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }

    public void pesquisarPorNome(String nome){
        Set<Convidado> convidadoPorNome = new HashSet<>();
        if (!convidadoSet.isEmpty()) {
            for (Convidado c : convidadoSet) {
                if (c.getNome().startsWith(nome)) {
                    convidadoPorNome.add(c);
                }
            }
            JOptionPane.showMessageDialog(null, convidadoPorNome, "Convidaos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Nenhum convidado encontrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atualizarCodigoConvidado(String nome, int novoCodigo){
        Convidado convidadoParaAtualizar = null;
        if (!convidadoSet.isEmpty()) {
            for (Convidado c : convidadoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setCodigoConvidado(novoCodigo);
                    convidadoParaAtualizar = c;
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "O código do convidado " + nome + " foi atualizado para " + novoCodigo, "Informe", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Nenhum convidado encontrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
