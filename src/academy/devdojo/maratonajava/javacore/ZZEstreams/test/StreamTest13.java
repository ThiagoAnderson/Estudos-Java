package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LighNovel> lighNovels = new ArrayList<>(List.of(
            new LighNovel("Nine Star Hegemon Body Arts", 2.15, Category.WUXIA),
            new LighNovel("Beyond The Timescape", 5.82, Category.FANTASY),
            new LighNovel("God Emperor", 9.15, Category.WUXIA),
            new LighNovel("The Legend of Futian", 3.15, Category.XIANXIA),
            new LighNovel("Renegade Immortal", 1.75, Category.XIANXIA)));

    public static void main(String[] args) {
        // Usando groupingBy para separar aquelas abaixo de 6 para "em promoção" e acima de 6 "preço normal"
        Map<Promotion, List<LighNovel>> collect = lighNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);
        // Map<Category, Map<Promotion, List<LighNovel>>>

        Map<Category, Map<Promotion, List<LighNovel>>> collect2 = lighNovels.stream().collect(Collectors.groupingBy(LighNovel::getCategory, // Agrupando por categoria
                Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));// Agrupar pela promoção
        System.out.println(collect2);
    }
}
