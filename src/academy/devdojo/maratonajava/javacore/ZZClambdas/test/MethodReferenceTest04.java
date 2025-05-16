package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a construtor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators =AnimeComparators::new; // Ainda não cria o objeto
        AnimeComparators animeComparators = newAnimeComparators.get(); // Agora cria o objeto chamando o .get
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bleach", 376), new Anime("One piece", 1098), new Anime("Naruto", 532)));

        animeList.sort(animeComparators::CompareByEpisodesNonStatic);

        System.out.println(animeList);

        BiFunction<String,Integer,Anime> animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String,Integer,Anime> animeBiFunction2 = Anime::new;
        // Para criar o objeto
        System.out.println(animeBiFunction2.apply("Super Onze",27));
    }
}
