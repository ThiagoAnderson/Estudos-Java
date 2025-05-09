package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Bleach");
        mangas.add("Fairy Tail");
        mangas.add("One Piece");
        mangas.add("Naruto");
        mangas.add("Black Clover");

        Collections.sort(mangas); // Reorganiza a ordem, os indices também são alterados

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.56);
        dinheiros.add(21.21);
        dinheiros.add(50.45);

        Collections.sort(dinheiros);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);
    }
}
