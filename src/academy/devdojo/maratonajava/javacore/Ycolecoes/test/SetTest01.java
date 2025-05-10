package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas  = new HashSet<>(); // Set permite apenas elementos unicos, e como instanciamos HashSet, estarao ordenados pelo Hash
        mangas.add(new Manga(1L,"Bleach",22.5,3));
        mangas.add(new Manga(2L,"Fairy Tail",19.55,7));
        mangas.add(new Manga(7L,"One Piece",30.50,28));
        mangas.add(new Manga(3L,"Naruto",12.99,12));
        mangas.add(new Manga(9L,"Black Clover",9.99,0));
        mangas.add(new Manga(9L,"Black Clover",9.99,0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
