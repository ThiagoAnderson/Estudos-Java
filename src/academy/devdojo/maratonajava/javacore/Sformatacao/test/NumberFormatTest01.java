package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.dominio.Local;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePTBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localItaly = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[4];

        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localePTBR);
        numberFormats[2] = NumberFormat.getInstance(localItaly);
        numberFormats[3] = NumberFormat.getInstance(localeJP);

        double valor = 10_000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(valor));
            
        }


    }
}
