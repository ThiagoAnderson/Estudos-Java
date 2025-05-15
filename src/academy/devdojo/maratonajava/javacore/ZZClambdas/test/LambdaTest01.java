package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> listStrings = List.of("Thiago", "Anderson", "Ichigo", "Long Chen");
        List<Integer> listInteger = List.of(1, 2, 3, 4, 5);
        forEach(listStrings,(String s)-> System.out.print(s+" "));
        System.out.println();
        forEach(listInteger,(Integer i)-> System.out.print(i+" "));

    }
    // Consumer: Recebe um valor de entrada e não retorna nada
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T e : list){
            consumer.accept(e);
        }
    }
}
