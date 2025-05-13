package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {

        NavigableMap<String,String> map = new TreeMap<>();
        map.put("A","Letra A");
        map.put("D","Letra D");
        map.put("B","Letra B");
        map.put("C","Letra C");
        map.put("E","Letra E");

        // O TreeMap ordena pela Key
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        // Todo mundo abaixo de C é retornado, ele esta linkado com o map original
        System.out.println(map.headMap("C"));
        System.out.println(map);


    }
}
