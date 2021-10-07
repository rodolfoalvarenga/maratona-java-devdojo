package academy.devdojo.maratonajava.javacore.Tresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        boolean sasa = bundle.containsKey("sasa");
        System.out.println(sasa);

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        // Fallback
        System.out.println(bundle.getString("hi"));

        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        // Fallback -> sistema procura os arquivos até encontrar o correto
        // Locale("fr", "CA");
        // messages_fr_CA.properties
        // messages_fr.properties
        // messages_en_US.properties
        // messages_en.properties
        // messages.properties

        System.out.println(bundle.getString("hi"));

    }

}
