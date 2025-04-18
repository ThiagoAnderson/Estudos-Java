package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormaterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String format = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format1 = date.format(DateTimeFormatter.ISO_DATE);
        String format2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);
        System.out.println(format1);
        System.out.println(format2);

        LocalDate parse1 = LocalDate.parse("20250418",DateTimeFormatter.BASIC_ISO_DATE);

        LocalDateTime now = LocalDateTime.now();
        String format3 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format3);
        LocalDateTime parse = LocalDateTime.parse("2025-04-18T19:12:39.0624341");
        System.out.println(parse);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format4 = LocalDate.now().format(formatterBR);
        System.out.println(format4);
        LocalDate parseBR = LocalDate.parse("18/04/2025", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(dateTimeFormatter);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("18.April.2025", dateTimeFormatter);
        System.out.println(parseGR);

    }
}
