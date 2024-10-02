package list;
import javax.swing.*;
import java.awt.*;

public class UsuarioListaTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        JFrame frame = new JFrame("Gerenciador de Tarefas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        String[] opcoes = {"Adicionar", "Remover", "Total de Tarefas", "Descrições"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);

        JTextField tarefa = new JTextField();
        tarefa.setVisible(false);

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancelar");
        JButton addButton = new JButton("Add");
        addButton.setVisible(false);

        cancelButton.setEnabled(false);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Configuração para o comboBox (linha 1, coluna 1 e 2)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // ocupa 2 colunas
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento
        gbc.weightx = 1; // Expande horizontalmente
        panel.add(comboBox, gbc);

        // Configuração para o JTextField tarefa (linha 2, coluna 1)
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(tarefa, gbc);

        // Configuração para o botão Add (linha 2, coluna 2)
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(addButton, gbc);

        // Configuração para o botão OK (linha 4, coluna 1)
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1; // Dividir espaço entre os botões
        gbc.anchor = GridBagConstraints.LINE_END; // Alinhar à direita
        panel.add(okButton, gbc);

        // Configuração para o botão Cancelar (linha 4, coluna 2)
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START; // Alinhar à esquerda
        panel.add(cancelButton, gbc);

        frame.add(panel);
        frame.setLocationRelativeTo(null); // Centralizar janela
        frame.setVisible(true);

        okButton.addActionListener(e -> {
            String opcaoSelecionada = (String) comboBox.getSelectedItem();

            if (opcaoSelecionada.equals("Adicionar")){
                tarefa.setVisible(true);
                addButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            } else if (opcaoSelecionada.equals("Remover")) {
                tarefa.setVisible(true);
                addButton.setText("Remover");
                addButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            } else if (opcaoSelecionada.equals("Total de Tarefas")) {
                int totalTarefas = listaTarefas.obterNumeroTotalTarefas();
                JOptionPane.showMessageDialog(null,"O total de tarefas cadastradas é " + totalTarefas, "Total de Tarefas", JOptionPane.INFORMATION_MESSAGE);
            } else if (opcaoSelecionada.equals("Descrições")) {
                listaTarefas.obterDescricoesTarefas();
            }
        });

        cancelButton.addActionListener(e -> {
            tarefa.setVisible(false);
            addButton.setVisible(false);
            addButton.setText("Add");
            tarefa.setText("");
            cancelButton.setEnabled(false);
            okButton.setEnabled(true);
            panel.revalidate();
            panel.repaint();
        });

        addButton.addActionListener(e -> {
            String textoBotao = addButton.getText();

            if (textoBotao.equals("Add")) {
                String novaTarefa = tarefa.getText();
                listaTarefas.adicionarTarefa(novaTarefa);
                tarefa.setText("");
            }
            else if (textoBotao.equals("Remover")){
                String novaTarefa = tarefa.getText();
                listaTarefas.removerTarefa(novaTarefa);
                tarefa.setText("");
            }
        });
    }
}
