package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        Integer[] listToArray = numeros.toArray(new Integer[0]); // Se utilizar o 0 na instanciação do novo aray, ele reflete o tamanho
        System.out.println(Arrays.toString(listToArray));

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 2;
        numerosArray[1] = 3;
        numerosArray[2] = 4;

        List<Integer> list = Arrays.asList(numerosArray); // Retorna uma lista, mas cria um link com o array existente

        System.out.println("------");
        // Criando listas sem vinculo com o array
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(14);
        System.out.println(numerosList);

        // Criando arrayList em uma unica linha
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        // List.of() A partir do Java 11

    }
}
