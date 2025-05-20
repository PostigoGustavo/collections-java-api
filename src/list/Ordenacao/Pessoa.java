package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.idade);
    }

    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public Pessoa(String nome, int idade, double altura) {
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

class CompatatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
