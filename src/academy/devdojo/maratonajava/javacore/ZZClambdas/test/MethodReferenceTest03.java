package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to a instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList(List.of("Ichigo", "Naruto", "Gon"));
        listNames.sort(String::compareTo);
        System.out.println(listNames);

        Function<String,Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        //BiPredicate passa dois argumentos
        BiPredicate<List<String>,String> checkName = List::contains;
        System.out.println(checkName.test(listNames,"Ichigo"));
    }
}
