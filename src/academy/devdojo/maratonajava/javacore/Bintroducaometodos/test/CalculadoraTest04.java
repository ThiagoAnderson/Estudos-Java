package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a,b);
        System.out.println("Fora de altera dois numeros");
        System.out.println(a);
        System.out.println(b);

        /* Com os parametros sendo primitivos, o Java cria uma copia que é passada para o metodo e essas copias
        que sao alteradas dentro do metodo. Ou seja passamos tipos primitivos para outro metodo, nunca passamos
        a referencia.
         */
    }
}
