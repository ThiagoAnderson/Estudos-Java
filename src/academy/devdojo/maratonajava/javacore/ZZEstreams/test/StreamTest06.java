package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LighNovel> lighNovels = new ArrayList<>(List.of(
            new LighNovel("Nine Star Hegemon Body Arts", 2.15),
            new LighNovel("Beyond The Timescape", 5.82),
            new LighNovel("God Emperor", 9.15),
            new LighNovel("The Legend of Futian", 3.15),
            new LighNovel("Renegade Immortal", 1.75)));

    public static void main(String[] args) {
        System.out.println(lighNovels.stream().anyMatch(ln -> ln.getPrice() > 8));
        System.out.println(lighNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lighNovels.stream().noneMatch(ln -> ln.getPrice() > 0));
        lighNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny() // Retorna qualquer um que atenda o predicate
                .ifPresent(System.out::println); // Retorna um optional, por isso precisa ser tratado com os metodos adequados

        lighNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LighNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
