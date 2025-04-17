package academy.devdojo.maratonajava.javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = " Ichigo";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // retorna o char baseado no indice
        System.out.println(nome.length()); // retorna o tamanho da string
        System.out.println(nome.replace("I","L")); // substitui o char em todos os casos, é keyse-sensitive
        System.out.println(nome.toUpperCase()); // transforma tudo em maiuscula
        System.out.println(nome.toLowerCase()); // transforma tudo em minuscula
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2)); // ele seleciona ate o tamanho final -1;
        System.out.println(nome.trim()); // remover valores em branco que tenham no começo e no fim


    }
}
