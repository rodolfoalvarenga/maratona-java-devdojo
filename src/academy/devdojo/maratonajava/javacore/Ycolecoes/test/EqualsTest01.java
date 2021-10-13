package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {

    public static void main(String[] args) {

//        String nome = "William Suane";
//        String nome2 = new String("William Suane");
//        System.out.println(nome.equals(nome2));

        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        // false
        System.out.println(s1.equals(s2));
        s2 = s1;
        // true
        System.out.println(s1.equals(s2));

    }

}
