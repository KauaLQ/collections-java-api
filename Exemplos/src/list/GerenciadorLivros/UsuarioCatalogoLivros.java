package list.GerenciadorLivros;
import javax.swing.*;
import java.awt.*;

public class UsuarioCatalogoLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        JFrame frame = new JFrame("Catálogo de Livros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        String[] opcoes = {"Adicionar", "Pesquisar por Autor", "Pesquisar por Intervalo de ano", "Pesquisar por Título"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);

        JTextField campoTitulo = new JTextField();
        JLabel textoTitulo = new JLabel("Título do Livro:");
        campoTitulo.setVisible(false);
        textoTitulo.setVisible(false);

        JTextField campoAutor = new JTextField();
        JLabel textoAutor = new JLabel("Nome do Autor:");
        textoAutor.setVisible(false);
        campoAutor.setVisible(false);

        JTextField campoAno = new JTextField();
        JLabel textoAno = new JLabel("Ano de Publicação:");
        textoAno.setVisible(false);
        campoAno.setVisible(false);

        JTextField campoAnoInicial = new JTextField();
        JLabel textoAnoInicial = new JLabel("Ano inicial:");
        textoAnoInicial.setVisible(false);
        campoAnoInicial.setVisible(false);

        JTextField campoAnoFinal = new JTextField();
        JLabel textoAnoFinal = new JLabel("Ano final:");
        textoAnoFinal.setVisible(false);
        campoAnoFinal.setVisible(false);

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
        gbc.gridwidth = 3; // ocupa 3 colunas
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento
        gbc.weightx = 1; // Expande horizontalmente
        panel.add(comboBox, gbc);

        // Configuração dos campos de texto que serão exibidos em situações específicas
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // ocupa 2 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(campoTitulo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // ocupa 2 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(campoAutor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(campoAnoInicial, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(campoAnoFinal, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // ocupa 2 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(campoAno, gbc);

        // Configuração dos textos que serão exibidos em situações específicas
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoTitulo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoAnoInicial, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoAnoFinal, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoAutor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(textoAno, gbc);

        // Configuração para o botão de ação (linha 2, coluna 2)
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        panel.add(acaoButton, gbc);

        // Configuração para o botão OK (linha 4, coluna 1)
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1; // ocupa 1 coluna
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1; // Dividir espaço entre os botões
        gbc.anchor = GridBagConstraints.LINE_END; // Alinhar à direita
        panel.add(okButton, gbc);

        // Configuração para o botão Cancelar (linha 4, coluna 2)
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.LINE_START; // Alinhar à esquerda
        panel.add(cancelButton, gbc);

        frame.add(panel);
        frame.setLocationRelativeTo(null); // Centralizar janela
        frame.setVisible(true);

        okButton.addActionListener(e -> {
            String opcaoSelecionada = (String) comboBox.getSelectedItem();
            frame.setSize(450, 225);
            frame.setLocationRelativeTo(null);

            if (opcaoSelecionada.equals("Adicionar")){
                campoTitulo.setVisible(true);
                textoTitulo.setVisible(true);
                campoAutor.setVisible(true);
                textoAutor.setVisible(true);
                campoAno.setVisible(true);
                textoAno.setVisible(true);
                acaoButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            } else if (opcaoSelecionada.equals("Pesquisar por Autor")) {
                campoAutor.setVisible(true);
                textoAutor.setVisible(true);
                acaoButton.setText("Pesquisar Autor");
                acaoButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            } else if (opcaoSelecionada.equals("Pesquisar por Intervalo de ano")) {
                campoAnoInicial.setVisible(true);
                textoAnoInicial.setVisible(true);
                campoAnoFinal.setVisible(true);
                textoAnoFinal.setVisible(true);
                acaoButton.setText("Pesquisar Intervalo");
                acaoButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            } else if (opcaoSelecionada.equals("Pesquisar por Título")) {
                campoTitulo.setVisible(true);
                textoTitulo.setVisible(true);
                acaoButton.setText("Pesquisar Título");
                acaoButton.setVisible(true);
                cancelButton.setEnabled(true);
                okButton.setEnabled(false);
                panel.revalidate(); // Atualiza o layout
                panel.repaint(); // Redesenha o painel
            }
        });

        cancelButton.addActionListener(e -> {
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);
            campoTitulo.setVisible(false);
            textoTitulo.setVisible(false);
            campoAutor.setVisible(false);
            textoAutor.setVisible(false);
            campoAno.setVisible(false);
            textoAno.setVisible(false);
            campoAnoInicial.setVisible(false);
            textoAnoInicial.setVisible(false);
            campoAnoFinal.setVisible(false);
            textoAnoFinal.setVisible(false);
            acaoButton.setVisible(false);
            acaoButton.setText("Adicionar");
            campoTitulo.setText("");
            campoAutor.setText("");
            campoAno.setText("");
            campoAnoInicial.setText("");
            campoAnoFinal.setText("");
            cancelButton.setEnabled(false);
            okButton.setEnabled(true);
            panel.revalidate();
            panel.repaint();
        });

        acaoButton.addActionListener(e -> {
            String textoBotao = acaoButton.getText();

            if (textoBotao.equals("Adicionar")) {
                String novoTitulo = campoTitulo.getText();
                String novoAutor = campoAutor.getText();
                int novoAno = Integer.parseInt(campoAno.getText());
                catalogoLivros.adicionarLivros(novoTitulo, novoAutor, novoAno);
                campoTitulo.setText("");
                campoAutor.setText("");
                campoAno.setText("");
            } else if (textoBotao.equals("Pesquisar Autor")){
                String novoAutor = campoAutor.getText();
                catalogoLivros.pesquisarPorAutor(novoAutor);
                campoAutor.setText("");
            } else if (textoBotao.equals("Pesquisar Intervalo")){
                int novoAnoInicial = Integer.parseInt(campoAnoInicial.getText());
                int novoAnoFinal = Integer.parseInt(campoAnoFinal.getText());
                catalogoLivros.pesquisarPorIntervaloAno(novoAnoInicial, novoAnoFinal);
                campoAnoInicial.setText("");
                campoAnoFinal.setText("");
            } else if (textoBotao.equals("Pesquisar Título")) {
                String novoTitulo = campoTitulo.getText();
                catalogoLivros.pesquisarPorTitulo(novoTitulo);
                campoTitulo.setText("");
            }
        });
    }
}
