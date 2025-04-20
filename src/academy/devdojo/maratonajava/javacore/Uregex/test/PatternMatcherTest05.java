package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto ="fulado@gmail.com, ciclano@gmail.com, #@$!beltrado@gmail.com, test@hotmail.com, thiago@mail.com";
        System.out.println("Email Valido");
        System.out.println("#@$!beltrado@gmail.com".matches(regex));
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
