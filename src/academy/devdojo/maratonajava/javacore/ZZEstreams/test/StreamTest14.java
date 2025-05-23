package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LighNovel> lighNovels = new ArrayList<>(List.of(
            new LighNovel("Nine Star Hegemon Body Arts", 2.15, Category.WUXIA),
            new LighNovel("Beyond The Timescape", 5.82, Category.FANTASY),
            new LighNovel("God Emperor", 9.15, Category.WUXIA),
            new LighNovel("The Legend of Futian", 3.15, Category.XIANXIA),
            new LighNovel("Renegade Immortal", 1.75, Category.XIANXIA)));

    public static void main(String[] args) {
        // Agrupando e contando
        Map<Category, Long> collect = lighNovels.stream().collect(Collectors.groupingBy(LighNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        // Agrupando e separando pelo mais caro de cada categoria
        Map<Category, Optional<LighNovel>> collect1 = lighNovels.stream()
                .collect(Collectors.groupingBy(LighNovel::getCategory, Collectors.maxBy(Comparator.comparing(LighNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LighNovel> collect2 = lighNovels.stream().collect(Collectors.groupingBy(LighNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LighNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LighNovel> collect3 = lighNovels.stream()
                .collect(Collectors.toMap(LighNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LighNovel::getPrice))));
        System.out.println(collect3);
    }
}
