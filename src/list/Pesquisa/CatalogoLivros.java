package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor() {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            System.out.println("Livros encontrados:");
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase("Autor")) {
                    livrosPorAutor.add(livro);
                }
            }
        } else {
            System.out.println("Nenhum livro encontrado.");
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!livroList.isEmpty()) {
            System.out.println("Livros encontrados:");
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalo.add(livro);
                }
            }
        } else {
            System.out.println("Nenhum livro encontrado.");
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!livroList.isEmpty()) {
            System.out.println("Livro encontrado:");
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = livro;
                    break;
                }
            }
        } else {
            System.out.println("Nenhum livro encontrado.");
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogo.adicionarLivro("1984", "George Orwell", 1949);
        catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);

        System.out.println("Pesquisa por autor:");
        List<Livro> livrosPorAutor = catalogo.pesquisarPorAutor();
        for (Livro livro : livrosPorAutor) {
            System.out.println(livro);
        }

        System.out.println("\nPesquisa por intervalo de anos:");
        List<Livro> livrosPorIntervalo = catalogo.pesquisarPorIntervaloAnos(1900, 2000);
        for (Livro livro : livrosPorIntervalo) {
            System.out.println(livro);
        }

        System.out.println("\nPesquisa por título:");
        Livro livroPorTitulo = catalogo.pesquisarPorTitulo("1984");
        if (livroPorTitulo != null) {
            System.out.println(livroPorTitulo);
        } else {
            System.out.println("Nenhum livro encontrado.");
        }
    }


}
