package Set.OperacoesBasicas;

public class Convidado {
    private int nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public int getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome=" + nome +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
