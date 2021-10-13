package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {

    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

//        smartphones.clear();

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone.toString());
        }

        Smartphone s4 = new Smartphone("22222", "Pixel");

        // s4.equals(s2)
        // quando item não existe na lista, retona -1, isso facilita no if de uma busca, pois quando -1 indica que o item não encontra-se na lista
        System.out.println(smartphones.contains(s4)); // s4.equals(s2)
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);
        System.out.println(smartphones.get(indexSmartphone4));

    }

}
