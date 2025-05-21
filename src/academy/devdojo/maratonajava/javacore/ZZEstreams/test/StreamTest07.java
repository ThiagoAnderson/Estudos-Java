package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 6);

        integers.stream().reduce((x,y) -> x+y); // Retorna um optional, por isso precisa ser tratato.ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, (x, y) -> x + y));// identity é o valor inicial, logo ele vai retornar um valor final não mais um optional

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1,Integer::sum));

        System.out.println("-------");

        integers.stream().reduce((x,y) -> x*y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1,(x,y)-> x*y));

        System.out.println("-------");

        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);;
        System.out.println(integers.stream().reduce(0,Integer::max));

    }
}
