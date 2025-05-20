package Set.Pesquisa;

import java.util.Objects;

public class Contatos {
    private String nome;
    private String telefone;

    public Contatos(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contatos contatos = (Contatos) o;
        return Objects.equals(nome, contatos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
