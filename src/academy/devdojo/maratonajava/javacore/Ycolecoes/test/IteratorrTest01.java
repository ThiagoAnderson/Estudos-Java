package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorrTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
                            // new LinkedList<>(); Tem melhor performace em remoções, ele sabe o proximo e o valor anterior de um objeto na lista
        mangas.add(new Manga(1L,"Bleach",22.5,3));
        mangas.add(new Manga(2L,"Fairy Tail",19.55,7));
        mangas.add(new Manga(7L,"One Piece",30.50,28));
        mangas.add(new Manga(3L,"Naruto",12.99,12));
        mangas.add(new Manga(9L,"Black Clover",9.99,0));

        // Iterator Checa antes de fazer alguma ação

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
