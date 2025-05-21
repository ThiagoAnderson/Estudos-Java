package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> grapichDesigners = List.of("Thiago Anderson", "Wildenei Soares","Willian Lemos");
        List<String> developers = List.of("Gabriel Barbosa", "Fernanda Cardoso","Maria Lillian");
        List<String> students = List.of("Maria Fernanda", "Juliana Mendonça","Pedro Paulo","Luiz Lima");
        devdojo.add(grapichDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for(String person : people){
                System.out.println(person);
            }
        }
        System.out.println("--------");
        // flatmap usado para retirar uma coleção ou atributo de dentro de outro lugar que esta aninhado "nested";
        devdojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);
    }
}
