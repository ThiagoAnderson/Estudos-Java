package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bleach", 376), new Anime("One piece", 1098), new Anime("Naruto", 532)));
       // animeList.sort(animeList, (a1,a2)->a1.getTitle().compareTo(a2.getTitle()));
       // animeList.sort(animeList, AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::CompareByEpisodes);
        System.out.println(animeList);

    }
}
