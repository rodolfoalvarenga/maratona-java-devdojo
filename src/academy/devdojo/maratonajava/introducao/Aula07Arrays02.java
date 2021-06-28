package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valores padrões na inicialização de um Array
        // byte, short, int, long, float e double = 0
        // char = '\u0000' ' '
        // boolean = fase
        // String = null

        // char[] exemploArray = new char[3];
        // boolean[] exemploArray = new boolean[3];
        // float[] exemploArray = new float[3];
        // String[] exemploArray = new String[3];
        // System.out.println(exemploArray[0]);
        // System.out.println(exemploArray[1]);
        // System.out.println(exemploArray[2]);

        // int[] exemploArray -> lado esquerdo é a variável tipo reference
        // new int[3]; -> é um objeto
        // int[] exemploArray = new int[3];

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // criando nova referência para o array nomes
        // assim, perde-se a referência anterior
        // através do Garbage Collector, os dados da referência anterior são limpos e deixam de existir
        nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
