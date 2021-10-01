package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(calendar);
        System.out.println(date);

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão é o primeiro dia da semana");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        // método add pode virar o dia, mês e ano
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.HOUR, 2);
        Date date2 = calendar.getTime();
        System.out.println(date2);

        // método roll não vira o dia, mês e ano
        calendar.roll(Calendar.HOUR, 17);
        Date date3 = calendar.getTime();
        System.out.println(date3);

    }

}
