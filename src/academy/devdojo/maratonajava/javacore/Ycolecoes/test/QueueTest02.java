package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangabyNameComparator());
        mangas.add(new Manga(1L,"Bleach",22.5,3));
        mangas.add(new Manga(2L,"Fairy Tail",19.55,7));
        mangas.add(new Manga(7L,"One Piece",30.50,28));
        mangas.add(new Manga(3L,"Naruto",12.99,12));
        mangas.add(new Manga(9L,"Black Clover",9.99,0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
