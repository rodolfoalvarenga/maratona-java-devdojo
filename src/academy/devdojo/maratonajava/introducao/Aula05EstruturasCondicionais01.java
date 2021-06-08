package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
//        int idade = 15;
//
//        if (idade >= 18) {
//            System.out.println("Autorizado a comprar bebida alcoólica");
//        }
//        System.out.println("Fora do if");

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        // !
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        boolean c = true;
        if (c = false) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        boolean d = false;
        if (d = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        // pegadinha de certificação, não se usa em cenário real
        boolean e = false;
        if (e == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
