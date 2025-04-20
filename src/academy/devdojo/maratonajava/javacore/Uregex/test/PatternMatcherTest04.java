package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo oque não for digito
        // \s = Espaços em branco \t  \n \f \r
        // \S = Todos os caracteres excluindo os em branco
        // \w = a-zA-Z, digitos, _
        // \W = tudo que nao for incluso no \w
        // [] = range de coisas dentro dos colchetes
        // ? = zero ou uma ocorrencia
        // *  = zero ou mais ocorrencias
        // +  = uma ou mais
        // {n,m} = de n até m
        //()
        // | =  o(v|c)o ovo | oco
        //$ = fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto ="12 0x 0X 0xFAABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto );
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
