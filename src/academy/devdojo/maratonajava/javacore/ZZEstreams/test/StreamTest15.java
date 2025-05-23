package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest15 {
    private static List<LighNovel> lighNovels = new ArrayList<>(List.of(
            new LighNovel("Nine Star Hegemon Body Arts", 2.15, Category.WUXIA),
            new LighNovel("Beyond The Timescape", 5.82, Category.FANTASY),
            new LighNovel("God Emperor", 9.15, Category.WUXIA),
            new LighNovel("The Legend of Futian", 3.15, Category.XIANXIA),
            new LighNovel("Renegade Immortal", 1.75, Category.XIANXIA)));

    public static void main(String[] args) {
        // Agrupando por categoria e mostrando estatisticas de cada categoria.
        Map<Category, DoubleSummaryStatistics> collect = lighNovels.stream()
                .collect(Collectors.groupingBy(LighNovel::getCategory, Collectors.summarizingDouble(LighNovel::getPrice)));
        System.out.println(collect);

        // Map<Category, List<Promotion>>
        Map<Category, Set<Promotion>> collect1 = lighNovels.stream()
                .collect(Collectors.groupingBy(LighNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect1);


        // Utilizando um linkedHashSet para manetr a ordem de inserção
        Map<Category, LinkedHashSet<Promotion>> collect2 = lighNovels.stream()
                .collect(Collectors.groupingBy(LighNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion,
                        Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }
    private static Promotion getPromotion(LighNovel ln){
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
