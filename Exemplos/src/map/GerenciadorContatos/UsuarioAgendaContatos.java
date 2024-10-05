package map.GerenciadorContatos;
import javax.swing.*;
import java.awt.*;
public class UsuarioAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        JFrame frame = new JFrame("Gerenciador de Contatos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        String[] opcoes = {"Adicionar", "Remover", "Total de Contatos", "Pesquisar Contato"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);

        JTextField nomeContato = new JTextField();
        nomeContato.setVisible(false);
        JTextField numeroContato = new JTextField();
        numeroContato.setVisible(false);

        JLabel textoNomeContato = new JLabel("Digite o nome do contato:");
        textoNomeContato.setVisible(false);
        JLabel textoNumeroContato = new JLabel("Digite o número do contato:");
        textoNumeroContato.setVisible(false);

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancelar");
        JButton addButton = new JButton("Adicionar");
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

        // Configuração para dos campos de texto que serão exibidos em situações específicas
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(nomeContato, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(numeroContato, gbc);

        // Configuração para dos Labels que serão exibidos em situações específicas
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoNomeContato, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoNumeroContato, gbc);

        // Configuração para o botão Add (linha 2, coluna 2)
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_END; // Alinhar à direita
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
                frame.setSize(450, 225);
                frame.setLocationRelativeTo(null);

                nomeContato.setVisible(true);
                textoNomeContato.setVisible(true);
                numeroContato.setVisible(true);
                textoNumeroContato.setVisible(true);
                addButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                okButton.setVisible(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            } else if (opcaoSelecionada.equals("Remover")) {
                frame.setSize(450, 225);
                frame.setLocationRelativeTo(null);

                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.gridwidth = 1; // ocupa 1 coluna
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.weightx = 0.5;
                panel.add(nomeContato, gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.weightx = 0.5;
                panel.add(textoNomeContato, gbc);

                nomeContato.setVisible(true);
                textoNomeContato.setVisible(true);
                addButton.setText("Remover");
                addButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                okButton.setVisible(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            } else if (opcaoSelecionada.equals("Total de Contatos")) {
                agendaContatos.exibirContatos();
            } else if (opcaoSelecionada.equals("Pesquisar Contato")) {
                frame.setSize(450, 225);
                frame.setLocationRelativeTo(null);

                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.gridwidth = 1; // ocupa 1 coluna
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.weightx = 0.5;
                panel.add(nomeContato, gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.weightx = 0.5;
                panel.add(textoNomeContato, gbc);

                nomeContato.setVisible(true);
                textoNomeContato.setVisible(true);
                addButton.setText("Pesquisar");
                addButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                okButton.setVisible(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            }
        });

        cancelButton.addActionListener(e -> {
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 1; // ocupa 1 coluna
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 0.5;
            panel.add(nomeContato, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.gridwidth = 1; // ocupa 1 coluna
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 0.5;
            panel.add(textoNomeContato, gbc);

            nomeContato.setVisible(false);
            textoNomeContato.setVisible(false);
            numeroContato.setVisible(false);
            textoNumeroContato.setVisible(false);
            addButton.setVisible(false);
            addButton.setText("Adicionar");
            nomeContato.setText("");
            numeroContato.setText("");
            cancelButton.setEnabled(false);
            okButton.setEnabled(true);
            okButton.setVisible(true);
            panel.revalidate();
            panel.repaint();
        });

        addButton.addActionListener(e -> {
            String textoBotao = addButton.getText();

            if (textoBotao.equals("Adicionar")) {
                String novoContato = nomeContato.getText();
                int novoNumero = Integer.parseInt(numeroContato.getText());
                agendaContatos.adicionarContatos(novoContato, novoNumero);
                nomeContato.setText("");
                numeroContato.setText("");
            }
            else if (textoBotao.equals("Remover")){
                String novoContato = nomeContato.getText();
                agendaContatos.removerContatos(novoContato);
                nomeContato.setText("");
            }
            else if (textoBotao.equals("Pesquisar")){
                String novoContato = nomeContato.getText();
                agendaContatos.pesquisarPorNome(novoContato);
                nomeContato.setText("");
            }
        });
    }
}
