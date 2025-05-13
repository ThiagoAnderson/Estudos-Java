package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // Par chave-valor
                                                    // Se quiser manter a ordem como no vc e vc2 utilizar LinkedHashMap
        //Exemplo num dicionário
        map.put("teklado", "teclado"); // Inserir pares chaves-valor no map com "put"
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc2", "você"); // So adiciona caso ele não exista, se tentar adicionar normalmente ele sobrescreve o valor
        System.out.println(map);

        // Pegando chaves e valores
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("---------");

        // Pegando valores a partir de "values"
        for (String values : map.values()) {
            System.out.println(values);
        }

        System.out.println("---------");
        // Um objeto que tem a chave-valor
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - "+entry.getValue());
        }

    }
}
