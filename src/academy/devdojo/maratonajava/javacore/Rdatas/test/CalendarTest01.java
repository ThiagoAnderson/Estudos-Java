package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingao é o primeiro dia da semana");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        calendar.add(Calendar.DAY_OF_WEEK,2);
        calendar.add(Calendar.HOUR,4);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
