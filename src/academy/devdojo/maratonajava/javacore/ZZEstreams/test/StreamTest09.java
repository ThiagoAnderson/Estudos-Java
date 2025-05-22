package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        //Trabalhando com Streams diretamente, sem precisar criar uma lista
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach((n -> System.out.print(n + " ")));
        System.out.println();
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach((n -> System.out.print(n + " ")));
        System.out.println();

        // Gerando uma stream diretamente
        Stream.of("Eleve ", "O ", "Cosmo ", "no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        int[] num = {1, 2, 3, 4, 5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        // Trabalhando com stream em arquivos, verificando linahs de um arquivo por exemplo
        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
                lines
                        .filter(l-> l.contains("Java"))
                        .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
