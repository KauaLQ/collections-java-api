package map.GerenciadorProdutos;
import javax.swing.*;
import java.awt.*;
public class UsuarioEstoqueProdutos {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        JFrame frame = new JFrame("Gerenciador de Produtos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        String[] opcoes = {"Adicionar", "Todos os Produtos", "Valor Total do Estoque", "Valor Mais Caro", "Valor Mais Barato"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);

        JTextField campoCodigo = new JTextField();
        JLabel textoCodigo = new JLabel("Código do Produto:");
        campoCodigo.setVisible(false);
        textoCodigo.setVisible(false);

        JTextField campoNome = new JTextField();
        JLabel textoNome = new JLabel("Nome do Produto:");
        textoNome.setVisible(false);
        campoNome.setVisible(false);

        JTextField campoPreco = new JTextField();
        JLabel textoPreco = new JLabel("Preço do Produto:");
        textoPreco.setVisible(false);
        campoPreco.setVisible(false);

        JTextField campoQuantidade = new JTextField();
        JLabel textoQuantidade = new JLabel("Quantidade do Produto:");
        textoQuantidade.setVisible(false);
        campoQuantidade.setVisible(false);

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancelar");
        JButton acaoButton = new JButton("Adicionar");
        acaoButton.setVisible(false);

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

        // Configuração dos campos de texto que serão exibidos em situações específicas
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(campoCodigo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(campoNome, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(campoPreco, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(campoQuantidade, gbc);

        // Configuração dos textos que serão exibidos em situações específicas
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoCodigo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoNome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoPreco, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoQuantidade, gbc);

        // Configuração para o botão de ação
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_END; // Alinhar à direita
        panel.add(acaoButton, gbc);

        // Configuração para o botão OK (linha 4, coluna 1)
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1; // Dividir espaço entre os botões
        gbc.anchor = GridBagConstraints.LINE_END; // Alinhar à direita
        panel.add(okButton, gbc);

        // Configuração para o botão Cancelar (linha 4, coluna 2)
        gbc.gridx = 1;
        gbc.gridy = 5;
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

                campoCodigo.setVisible(true);
                textoCodigo.setVisible(true);
                campoNome.setVisible(true);
                textoNome.setVisible(true);
                campoPreco.setVisible(true);
                textoPreco.setVisible(true);
                campoQuantidade.setVisible(true);
                textoQuantidade.setVisible(true);
                acaoButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                okButton.setVisible(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            } else if (opcaoSelecionada.equals("Todos os Produtos")) {
                estoqueProdutos.exibirProduto();
            } else if (opcaoSelecionada.equals("Valor Total do Estoque")) {
                estoqueProdutos.calcularValorTotalEstoque();
            } else if (opcaoSelecionada.equals("Valor Mais Caro")) {
                estoqueProdutos.obterProdutoMaisCaro();
            } else if (opcaoSelecionada.equals("Valor Mais Barato")) {
                estoqueProdutos.obterProdutoMaisBarato();
            }
        });

        cancelButton.addActionListener(e -> {
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);

            campoCodigo.setVisible(false);
            textoCodigo.setVisible(false);
            campoNome.setVisible(false);
            textoNome.setVisible(false);
            campoPreco.setVisible(false);
            textoPreco.setVisible(false);
            campoQuantidade.setVisible(false);
            textoQuantidade.setVisible(false);
            acaoButton.setVisible(false);
            campoCodigo.setText("");
            campoNome.setText("");
            campoPreco.setText("");
            campoQuantidade.setText("");
            cancelButton.setEnabled(false);
            okButton.setEnabled(true);
            okButton.setVisible(true);
            panel.revalidate();
            panel.repaint();
        });

        acaoButton.addActionListener(e -> {
            long novoCodigo = Long.parseLong(campoCodigo.getText());
            String novoNome = campoNome.getText();
            double novoPreco = Double.parseDouble(campoPreco.getText());
            int novaQuantidade = Integer.parseInt(campoQuantidade.getText());
            estoqueProdutos.adicionarProduto(novoCodigo, novoNome, novoPreco, novaQuantidade);
            campoCodigo.setText("");
            campoNome.setText("");
            campoPreco.setText("");
            campoQuantidade.setText("");
        });
    }
}
