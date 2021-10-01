package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {

    public static void main(String[] args) {

        Date date = new Date(1633106412921L); // long milisegundos desde 1/01/1970
        date.setTime(date.getTime() + 3_600_000L); // adicionando 1 hora
        System.out.println(date);
        System.out.println(date.getTime()); // representa o dia de hoje

    }

}
