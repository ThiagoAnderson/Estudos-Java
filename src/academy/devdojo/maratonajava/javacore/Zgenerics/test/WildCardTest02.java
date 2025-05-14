package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
    List<Cachorro> cachorroList = List.of(new Cachorro(),new Cachorro());
    List<Gato> gatoList = List.of(new Gato(),new Gato());
    printConsulta(cachorroList);
    printConsulta(gatoList);
    List<Animal> animals = new ArrayList<>();
    printConsultaAnimal(animals);
    }
    // Type erasure
    private static void printConsulta(List<? extends Animal> animals){ // Recebe qualquer um que for Animal ou seja filho
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    private static void printConsultaAnimal(List<? super Animal> animals){ // Recebe qualquer um que for Animal ou seja pai
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
