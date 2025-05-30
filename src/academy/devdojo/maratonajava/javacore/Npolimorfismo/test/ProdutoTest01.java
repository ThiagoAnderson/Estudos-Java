package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("IO092",7000);
        Tomate tomate = new Tomate("Tomate-verde", 10);
        Televisao tv = new Televisao("Sumsung 50",5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
