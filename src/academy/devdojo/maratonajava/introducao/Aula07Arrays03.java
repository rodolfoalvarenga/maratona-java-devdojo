package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // Formas de inicializar um Array
        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        // Nova forma de imprimir um Array
        // não tem como acessar um índice específico
        // variável do for tem que ser igual ao do tipo do Array
        for(int num : numeros3) {
            System.out.println(num);
        }

        // o que ocorre por baixo do pano
        int num = numeros3[0];
        System.out.println(num);
        num = numeros3[1];
        System.out.println(num);
        num = numeros3[2];
        System.out.println(num);
        num = numeros3[3];
        System.out.println(num);
        num = numeros3[4];
        System.out.println(num);
    }
}
