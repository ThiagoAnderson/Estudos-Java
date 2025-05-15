package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> listStrings = List.of("Ichigo", "Naruto");
        List<Integer> inteiros = map(listStrings, (String s) -> s.length());
        System.out.println(inteiros);

    }
    // Function: Recebe um valor de entrada e retorna um valor de saida
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T r : list) {
            R apply = function.apply(r);
            result.add(apply);
        }
        return result;
    }
}
