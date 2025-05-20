package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LighNovel> lighNovels = new ArrayList<>( List.of(
        new LighNovel("Nine Star Hegemon Body Arts",2.15),
        new LighNovel("Beyond The Timescape",5.82),
        new LighNovel("God Emperor",9.15),
        new LighNovel("The Legend of Futian",3.15),
        new LighNovel("Renegade Immortal",1.75)));

    public static void main(String[] args) {
        Stream<LighNovel> stream = lighNovels.stream();
        lighNovels.stream().forEach(System.out::println);
        long count1 = stream.
                filter((lighNovel -> lighNovel.getPrice() <= 4))
                .count();
        long count2 = stream
                .distinct()
                .filter((lighNovel -> lighNovel.getPrice() <= 4))
                .count();
        System.out.println(count1);
        System.out.println(count2);
    }
}
