package list.GerenciadorLivros;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtores
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //formatação
    @Override
    public String toString() {
        return "\nLivro{" +
                "Titulo: " + titulo +
                ", Autor: " + autor +
                ", Ano de publicação: " + anoPublicacao +
                "}\n";
    }
}
