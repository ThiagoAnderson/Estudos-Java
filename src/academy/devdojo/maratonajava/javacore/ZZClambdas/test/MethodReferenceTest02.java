package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bleach", 376), new Anime("One piece", 1098), new Anime("Naruto", 532)));
        animeList.sort(animeComparators::CompareByEpisodesNonStatic);
        animeList.sort((a1,a2) ->animeComparators.CompareByEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
