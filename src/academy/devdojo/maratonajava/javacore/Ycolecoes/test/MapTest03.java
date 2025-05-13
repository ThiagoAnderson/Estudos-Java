package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Thiago Anderson");
        Consumidor consumidor2 = new Consumidor("Youtube");

        Manga manga1 = new Manga(1L, "Bleach", 22.5);
        Manga manga2 = new Manga(2L,"Fairy Tail",19.55);
        Manga manga3 = new Manga(7L,"One Piece",30.50);
        Manga manga4 = new Manga(3L,"Naruto",12.99);
        Manga manga5 = new Manga(9L,"Black Clover",9.9);

        List<Manga> mangaList = List.of(manga1,manga2,manga3);
        List<Manga> mangaList2 = List.of(manga1,manga4,manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1,mangaList);
        consumidorMangaMap.put(consumidor2,mangaList2);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }



    }
}
