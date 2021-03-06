package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {

    private String nome;
    public static final double VELOCIDADE_LIMITE;
    public final Comprador COMPRADOR = new Comprador();

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public final double VELOCIDADE_LIMITE_2;

    {
        VELOCIDADE_LIMITE_2 = 290;
    }

    public final double VELOCIDADE_LIMITE_CONSTRUTOR;

    public Carro() {
        VELOCIDADE_LIMITE_CONSTRUTOR = 300;
    }

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
