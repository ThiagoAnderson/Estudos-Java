package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(
            List.of(
                    new Carro("BMW"),
                    new Carro("Mercedes"))
    );
    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro disponivel....");
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+c);
        System.out.println("Carros Disponiveis para alugar");
        System.out.println(carrosDisponiveis);
        return c;
    }

    public void retornarCarroAlugado(Carro c){
        System.out.println("Devolvendo carro"+c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
