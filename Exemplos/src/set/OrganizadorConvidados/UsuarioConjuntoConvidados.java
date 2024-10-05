package set.OrganizadorConvidados;
import javax.swing.*;
import java.awt.*;
public class UsuarioConjuntoConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        JFrame frame = new JFrame("Organizador de Convidados");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        String[] opcoes = {"Adicionar", "Remover", "Total de Convidados", "Todos os Convidados"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);

        JTextField nomeConvidado = new JTextField();
        nomeConvidado.setVisible(false);
        JTextField codigoConvidado = new JTextField();
        codigoConvidado.setVisible(false);

        JLabel textoNomeConvidado = new JLabel("Digite o nome do convidado:");
        textoNomeConvidado.setVisible(false);
        JLabel textoCodigoConvidado = new JLabel("Digite o código do convidado:");
        textoCodigoConvidado.setVisible(false);

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
        panel.add(nomeConvidado, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(codigoConvidado, gbc);

        // Configuração para dos Labels que serão exibidos em situações específicas
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoNomeConvidado, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoCodigoConvidado, gbc);

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

                nomeConvidado.setVisible(true);
                textoNomeConvidado.setVisible(true);
                codigoConvidado.setVisible(true);
                textoCodigoConvidado.setVisible(true);
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
                panel.add(codigoConvidado, gbc);

                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.weightx = 0.5;
                panel.add(textoCodigoConvidado, gbc);

                codigoConvidado.setVisible(true);
                textoCodigoConvidado.setVisible(true);
                addButton.setText("Remover");
                addButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                okButton.setVisible(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            } else if (opcaoSelecionada.equals("Total de Convidados")) {
                conjuntoConvidados.contarConvidados();
            } else if (opcaoSelecionada.equals("Todos os Convidados")) {
                conjuntoConvidados.exibirConvidados();
            }
        });

        cancelButton.addActionListener(e -> {
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);

            gbc.gridx = 1;
            gbc.gridy = 2;
            gbc.gridwidth = 1; // ocupa 1 coluna
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 0.5;
            panel.add(codigoConvidado, gbc);

            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.gridwidth = 1; // ocupa 1 coluna
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 0.5;
            panel.add(textoCodigoConvidado, gbc);

            nomeConvidado.setVisible(false);
            textoNomeConvidado.setVisible(false);
            codigoConvidado.setVisible(false);
            textoCodigoConvidado.setVisible(false);
            addButton.setVisible(false);
            addButton.setText("Adicionar");
            nomeConvidado.setText("");
            codigoConvidado.setText("");
            cancelButton.setEnabled(false);
            okButton.setEnabled(true);
            okButton.setVisible(true);
            panel.revalidate();
            panel.repaint();
        });

        addButton.addActionListener(e -> {
            String textoBotao = addButton.getText();

            if (textoBotao.equals("Adicionar")) {
                String novaConvidado = nomeConvidado.getText();
                int novoCodigo = Integer.parseInt(codigoConvidado.getText());
                conjuntoConvidados.adicionarConvidado(novaConvidado, novoCodigo);
                nomeConvidado.setText("");
                codigoConvidado.setText("");
            }
            else if (textoBotao.equals("Remover")){
                int novoCodigo = Integer.parseInt(codigoConvidado.getText());
                conjuntoConvidados.removerConvidado(novoCodigo);
                codigoConvidado.setText("");
            }
        });
    }
}
