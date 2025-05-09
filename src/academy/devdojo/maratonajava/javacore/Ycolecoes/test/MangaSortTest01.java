package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangabyNameComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getNome().compareTo(manga2.getNome());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"Bleach",22.5));
        mangas.add(new Manga(2L,"Fairy Tail",19.55));
        mangas.add(new Manga(7L,"One Piece",30.50));
        mangas.add(new Manga(3L,"Naruto",12.99));
        mangas.add(new Manga(9L,"Black Clover",9.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-----------");

        // So funciona em Wrappers, ou em objetos que o equals e hashCode foram sobrescritos e a classe Comparable foi implamentada e compareTo foi sobrescrita
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------");

        // Necessario criar uma classe Comparator, forma mais facil
        Collections.sort(mangas,new MangabyNameComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
