package me.ederign.demo;

public class Venda {

    private final Vendedor vendedor;
    private final int ano;
    private final int valor;

    public Venda( Vendedor vendedor,
                  int ano,
                  int valor ) {
        this.vendedor = vendedor;
        this.ano = ano;
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public int getAno() {
        return ano;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "vendedor=" + vendedor +
                ", ano=" + ano +
                ", valor=" + valor +
                '}';
    }
}
