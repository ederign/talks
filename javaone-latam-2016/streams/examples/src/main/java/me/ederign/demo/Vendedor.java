package me.ederign.demo;

public class Vendedor {

    private final String nome;
    private final String cidade;

    public Vendedor( String nome,
                     String cidade ) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
