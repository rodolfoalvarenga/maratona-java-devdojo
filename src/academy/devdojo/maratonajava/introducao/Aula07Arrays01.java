package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // variável Array é tipo reference, um objeto
        // tipo reference pode iniciar com null, poid não faz referência em memória
        // primitivo não
        // int[] idades = null;

        // valores padrão em inicialização de Array sem declaração
        // para números, o padrão é 0
        // para String é null

        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        // Caso não esteja dentro do limite do Array
        // lança a exceção ArrayIndexOutOfBoundsException
        // idades[3] = 11;
    }
}
