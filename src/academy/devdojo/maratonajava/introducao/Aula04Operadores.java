package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01 + numero02);
        System.out.println("Valor " + numero01 + numero02);
        System.out.println(numero01 + numero02 + " Valor " + numero01 + numero02);

        int soma = numero01 + numero02;
        System.out.println(soma);

        // divisão de números inteiros sempre resulta em um inteiro
        double divisao = numero01 / numero02;
        System.out.println(divisao);
    }
}
