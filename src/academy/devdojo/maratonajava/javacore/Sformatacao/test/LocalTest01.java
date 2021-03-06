package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {

    public static void main(String[] args) {

        // pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeHolland = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolland);

        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: : " + df2.format(calendar.getTime()));
        System.out.println("Índia: " + df3.format(calendar.getTime()));
        System.out.println("Japão: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry(localeHolland));
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry(localeJapan));
        System.out.println(localeCH.getDisplayLanguage(localeJapan));

    }

}
