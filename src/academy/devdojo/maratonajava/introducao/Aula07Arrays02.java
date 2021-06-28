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
        String[] exemploArray = new String[3];
        System.out.println(exemploArray[0]);
        System.out.println(exemploArray[1]);
        System.out.println(exemploArray[2]);

        // int[] exemploArray -> lado esquerdo é a variável tipo reference
        // new int[3]; -> é um objeto
        // int[] exemploArray = new int[3];
    }
}
