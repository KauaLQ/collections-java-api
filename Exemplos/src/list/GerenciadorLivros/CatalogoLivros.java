package list.GerenciadorLivros;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    //construtor
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //métodos
    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
        JOptionPane.showMessageDialog(null, "Novo Livro catalogado!", "Informe", JOptionPane.INFORMATION_MESSAGE);
    }

    public void pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
            JOptionPane.showMessageDialog(null, livroPorAutor, "Livros feitos por " + autor, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervaloAno.add(l);
                }
            }
            JOptionPane.showMessageDialog(null, livroPorIntervaloAno, "Livros escritos no intervalo de " + anoInicial + " à " + anoFinal, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, livroPorTitulo, "O livro mais antigo catalogado com esse titúlo foi:", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
