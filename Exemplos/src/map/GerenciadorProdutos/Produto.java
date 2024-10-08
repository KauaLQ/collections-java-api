package map.GerenciadorProdutos;
import javax.swing.*;
public class Produto {
    //atributo
    private String nome;
    private double preco;
    private int quantidade;

    //construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    //toString
    @Override
    public String toString() {
        return "Produto: " + nome +
                ", preco: " + preco +
                ", quantidade: " + quantidade +
                "\n";
    }
}
