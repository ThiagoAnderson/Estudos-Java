package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smarphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneMarcaComparator implements Comparator<Smarphone>{
    @Override
    public int compare(Smarphone o1, Smarphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigalbeSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smarphone> set = new TreeSet<>( new SmartPhoneMarcaComparator()); // Geralmente classes com Tree, é necessario ter certeza que elas possuam Comparable
        Smarphone smarphone = new Smarphone("123", "Noka");
        set.add(smarphone);
        System.out.println(set);
        // TreeSet vai fazer a organização da sua coleção, baseado no seu CompareTo que foi implementado na classe referenciada
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(1L,"Bleach",22.5,3));
        mangas.add(new Manga(2L,"Fairy Tail",19.55,7));
        mangas.add(new Manga(7L,"One Piece",30.50,28));
        mangas.add(new Manga(3L,"Naruto",12.99,12));
        mangas.add(new Manga(9L,"Black Clover",9.99,0));

        for (Manga manga : mangas.descendingSet() /*inverte a ordem*/ ) {
            System.out.println(manga);
        }
        Manga yuyu = new Manga(21L,"Yuyu Hakusho",15,5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("---------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // Retorna e remove o primeiro elemento da lista
        System.out.println(mangas.pollLast()); // Retorna e remove o ultimo elemento da lista
        System.out.println(mangas.size());


    }
}
