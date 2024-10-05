package map.GerenciadorProdutos;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
        JOptionPane.showMessageDialog(null, "Novo produto adicionado!", "Informe", JOptionPane.INFORMATION_MESSAGE);
    }

    public void exibirProduto(){
        if (!estoqueProdutosMap.isEmpty()) {
            JOptionPane.showMessageDialog(null, estoqueProdutosMap, "Produtos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
            JOptionPane.showMessageDialog(null, "O valor total do estoque é R$ " + valorTotalEstoque, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double precoAtual = 0;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > precoAtual){
                    precoAtual = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
            JOptionPane.showMessageDialog(null, produtoMaisCaro, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double precoAtual = 0;
        boolean flag = true;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (flag){
                    precoAtual = p.getPreco();
                    flag = false;
                }
                if (p.getPreco() < precoAtual){
                    precoAtual = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
            JOptionPane.showMessageDialog(null, produtoMaisBarato, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
