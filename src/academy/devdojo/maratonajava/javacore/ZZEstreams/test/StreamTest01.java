package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Order LighNivel by title;
// 2. Retrieve the first 3 titles LightNovel with price less than 4
public class StreamTest01 {
        private static List<LighNovel> lighNovels = new ArrayList<>( List.of(
                new LighNovel("Nine Star Hegemon Body Arts",2.15),
                new LighNovel("Beyond The Timescape",5.82),
                new LighNovel("God Emperor",9.15),
                new LighNovel("The Legend of Futian",3.15),
                new LighNovel("Renegade Immortal",1.75)));
    public static void main(String[] args) {
        lighNovels.sort(Comparator.comparing(LighNovel::getTile));
        List<String> title = new ArrayList<>();
        for (LighNovel lighNovel : lighNovels) {
            if(lighNovel.getPrice() <= 4){
                title.add(lighNovel.getTile());
            }
            if(title.size()>= 3){
                break;
            }
        }

        System.out.println(lighNovels);
        System.out.println(title);
    }
}
