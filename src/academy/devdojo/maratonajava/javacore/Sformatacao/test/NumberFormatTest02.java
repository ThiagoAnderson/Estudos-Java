package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePTBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localItaly = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[4];

        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localePTBR);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localItaly);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 10_000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

    }
}
