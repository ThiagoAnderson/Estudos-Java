package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"Bleach",22.5));
        mangas.add(new Manga(2L,"Fairy Tail",19.55));
        mangas.add(new Manga(7L,"One Piece",30.50));
        mangas.add(new Manga(3L,"Naruto",12.99));
        mangas.add(new Manga(9L,"Black Clover",9.99));

    //   Collections.sort(mangas);
        mangas.sort(new MangabyNameComparator());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga mangaSearch = new Manga(2L, "Fairy Tail", 19.55);
        System.out.println(Collections.binarySearch(mangas,mangaSearch,new MangabyNameComparator()));


    }
}
