package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divisaoDoisNumeros(20,0);
        System.out.println(resultado);
        System.out.println(calculadora.divisaoDoisNumeros2(20,0));
        System.out.println("-------");
        /* Nao é possivel colocar um metodo que retorna void dentro de um system.out.println
        System.out.println(calculadora.imprimeDivisaoDoisNumeros(86,0));
         */
        calculadora.imprimeDivisaoDoisNumeros(86,0);
    }
}
