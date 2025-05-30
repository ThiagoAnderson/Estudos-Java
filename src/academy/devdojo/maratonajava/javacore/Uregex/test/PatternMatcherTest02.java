package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo oque não for digito
        // \s = Espaços em branco \t  \n \f \r
        // \S = Todos os caracteres excluindo os em branco
        // \w = a-zA-Z, digitos, _
        // \W = tudo que nao for incluso no \w
        String regex ="\\W";
        // String texto ="abaaba";
        String texto2 ="ads5_44as5";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2 );
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
