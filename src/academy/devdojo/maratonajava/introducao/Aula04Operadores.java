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
        // pode usar casting, mas não é recomendável
        double divisao = numero01 / (double) numero02;
        System.out.println(divisao);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVInte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVInte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && (and) || (or) ! (not)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612F;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381F;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystationCinco = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystationCinco ||
                valorTotalContaPoupanca > valorPlaystationCinco;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // incremento ++ e decremento --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++); // 0
        System.out.println(contador2); // 1

        int contador3 = 0;
        System.out.println(++contador3); // 1
        System.out.println(contador3); // 1
    }
}
