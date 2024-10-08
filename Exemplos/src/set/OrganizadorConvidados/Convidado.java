package set.OrganizadorConvidados;

import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;
    private int codigoConvidado;

    //construtores
    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    //setter
    public void setCodigoConvidado(int codigoConvidado) {
        this.codigoConvidado = codigoConvidado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvidado() == convidado.getCodigoConvidado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvidado());
    }

    //formatação
    @Override
    public String toString() {
        return "\nConvidado: " + nome +
                ", Codigo do Convidado: " + codigoConvidado +
                "\n";
    }
}
