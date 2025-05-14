package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure, essa verificação acontece em tempo de compilação
        List<String> lista = new ArrayList<>();
        lista.add("Ichigo");
        lista.add("Ichigo");

        for (String s : lista) {
            System.out.println(s);
        }
        add(lista,new Consumidor("Thiago")); // Esta linha compila normalmente, mas o for abaixo estoura um ClassCastException
        for (String s : lista) {
            System.out.println(s);
        }
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
