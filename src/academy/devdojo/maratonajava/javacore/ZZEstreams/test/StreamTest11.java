package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {private static List<LighNovel> lighNovels = new ArrayList<>(List.of(
        new LighNovel("Nine Star Hegemon Body Arts", 2.15),
        new LighNovel("Beyond The Timescape", 5.82),
        new LighNovel("God Emperor", 9.15),
        new LighNovel("The Legend of Futian", 3.15),
        new LighNovel("Renegade Immortal", 1.75)));

    public static void main(String[] args) {
        System.out.println(lighNovels.stream().count());
        System.out.println(lighNovels.stream().collect(Collectors.counting()));

        lighNovels.stream().max(Comparator.comparing(LighNovel::getPrice)).ifPresent(System.out::println);
        lighNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LighNovel::getPrice))).ifPresent(System.out::println);

        double sum = lighNovels.stream().mapToDouble(LighNovel::getPrice).sum();
        System.out.println(sum);
        System.out.println();

        Double collect = lighNovels.stream().collect(Collectors.summingDouble(LighNovel::getPrice));
        System.out.println(collect);
        System.out.println();

        Double collect1 = lighNovels.stream().collect(Collectors.averagingDouble(LighNovel::getPrice));
        System.out.println(collect1);

        DoubleSummaryStatistics col = lighNovels.stream().collect(Collectors.summarizingDouble(LighNovel::getPrice));
        System.out.println(col);

        String string = lighNovels.stream().map(LighNovel::getTile).collect(Collectors.joining(", "));
        System.out.println(string);
    }
}
