package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(
            List.of(
                    new Barco("Lancha"),
                    new Barco("Iate"))
    );
    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco disponivel....");
        Barco b = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: "+b);
        System.out.println("Barcos Disponiveis para alugar");
        System.out.println(barcosDisponiveis);
        return b;
    }

    public void retornarBarcoAlugado(Barco b){
        System.out.println("Devolvendo barco "+b);
        barcosDisponiveis.add(b);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
