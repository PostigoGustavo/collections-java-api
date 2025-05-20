package Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos> {
    @Override
    public int compareTo(Produtos p) {
        return produto.compareToIgnoreCase(p.getProduto());
    }

    private String produto;
    private double preco;
    private long codigoProduto;
    private int quantidade;

    public Produtos(String produto, double preco, long codigoProduto, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return codigoProduto == produtos.codigoProduto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoProduto);
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "produto='" + produto + '\'' +
                ", preco=" + preco +
                ", codigoProduto=" + codigoProduto +
                ", quantidade=" + quantidade +
                '}';
    }
}

class ComparatorPorPreco implements Comparator<Produtos> {

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
