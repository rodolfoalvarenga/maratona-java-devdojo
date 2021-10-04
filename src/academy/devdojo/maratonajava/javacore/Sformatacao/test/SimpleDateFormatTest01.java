package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {

        // aspas simples '' ignora o SimpleDateFormat
        //String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Amsterdam 04 de outubro de 2021"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
