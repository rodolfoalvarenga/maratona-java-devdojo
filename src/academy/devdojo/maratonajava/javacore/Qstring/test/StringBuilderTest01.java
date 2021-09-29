package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {

    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        nome.substring(0, 3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("William Suane");
        // Também funciona para StringBuffer da mesma forma
//        StringBuffer sb = new StringBuffer("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.substring(0, 2); // retorna String, sempre verificar se retorna String ou StringBuilder
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }

}
