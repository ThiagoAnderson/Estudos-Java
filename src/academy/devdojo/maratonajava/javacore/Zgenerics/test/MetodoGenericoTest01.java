package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa"));

    }

    private static <T> void criarArrayComUmObjeto(T t) { // Receber apenas obj do tipo comparable <T extends Comparable>
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}

