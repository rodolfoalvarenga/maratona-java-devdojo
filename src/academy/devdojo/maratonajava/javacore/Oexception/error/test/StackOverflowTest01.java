package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {

    // Error acontece na JVM e não pode ser arrumado em tempo de execução
    public static void main(String[] args) {
        recursividade();
    }

    // simulando StackOverflowError (estoura o limite de memória disponível)
    public static void recursividade() {
        recursividade();
    }

}
