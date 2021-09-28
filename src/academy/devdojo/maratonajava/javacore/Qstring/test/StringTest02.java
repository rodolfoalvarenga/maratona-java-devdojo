package academy.devdojo.maratonajava.javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {

    public static void main(String[] args) {

        String nome = "Luffy";
        String numeros = "012345";
        String usernameComEspaco = " Goku       ";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.length());
        // índice que termina é sempre um a menos que está terminando
        System.out.println(numeros.substring(0, 2)); // 01
        // retorna de uma posição até o final dela, não precisa colocar (3, numeros.length())
        System.out.println(numeros.substring(3));

        // retira valores em branco, vazio, do começo e fim da String, recomendado nos campos de validação de usuário
        System.out.println(usernameComEspaco.trim());

    }

}
