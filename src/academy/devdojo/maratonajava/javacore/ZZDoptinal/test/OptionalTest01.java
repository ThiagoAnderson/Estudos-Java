package academy.devdojo.maratonajava.javacore.ZZDoptinal.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

// Optional é um objeto que vai encapsular os outros objetos
public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("string aleatoria :)");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("----------");

        Optional<String> nameOptional =findName("Thiago");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
    private static Optional<String> findName(String name){
        List<String> list = List.of("Thiago", "Anderson");
        int i = list.indexOf(name);
        if(i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
