package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Thiago Anderson");
        Consumidor consumidor2 = new Consumidor("Youtube");

        Manga manga1 = new Manga(1L, "Bleach", 22.5);
        Manga manga2 = new Manga(2L,"Fairy Tail",19.55);
        Manga manga3 = new Manga(7L,"One Piece",30.50);
        Manga manga4 = new Manga(3L,"Naruto",12.99);
        Manga manga5 = new Manga(9L,"Black Clover",9.9);

        Map<Consumidor,Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga1);
        consumidorManga.put(consumidor2,manga3);

        for(Map.Entry<Consumidor,Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome()+ " - " +entry.getValue().getNome());
        }
    }
}
