package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            // 1 a 10
            //System.out.println(++count);

            // 0 a 9
            System.out.println(count);
            count++;
        }

        count = 0;
        do {
            System.out.println("Dentro do do-while " + count);
            count++;
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }

//        for (count = 0; count < 10; count++) {
//            System.out.println("For " + count);
//        }
    }
}
