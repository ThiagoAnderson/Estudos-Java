package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {private static List<LighNovel> lighNovels = new ArrayList<>(List.of(
        new LighNovel("Nine Star Hegemon Body Arts", 2.15),
        new LighNovel("Beyond The Timescape", 5.82),
        new LighNovel("God Emperor", 9.15),
        new LighNovel("The Legend of Futian", 3.15),
        new LighNovel("Renegade Immortal", 1.75)));

    public static void main(String[] args) {
        lighNovels.stream().map(LighNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum).ifPresent(System.out::println);

        double sum = lighNovels.stream()
                .mapToDouble(LighNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
    }
}
