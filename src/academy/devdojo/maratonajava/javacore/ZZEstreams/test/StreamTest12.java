package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {private static List<LighNovel> lighNovels = new ArrayList<>(List.of(
        new LighNovel("Nine Star Hegemon Body Arts", 2.15, Category.WUXIA),
        new LighNovel("Beyond The Timescape", 5.82,Category.FANTASY),
        new LighNovel("God Emperor", 9.15,Category.WUXIA),
        new LighNovel("The Legend of Futian", 3.15,Category.XIANXIA),
        new LighNovel("Renegade Immortal", 1.75,Category.XIANXIA)));
    public static void main(String[] args) {

        Map<Category,List<LighNovel>> categoryLighNovel = new HashMap<>();

        Map<Category, List<LighNovel>> collect = lighNovels.stream().collect(Collectors.groupingBy(LighNovel::getCategory));
        System.out.println(collect);

    }
}
