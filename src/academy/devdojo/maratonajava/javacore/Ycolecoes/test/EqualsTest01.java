package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smarphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        /* Equals com String compara se os valores de ambas as variaveis são iguais, mas com Objetos ele compara a
         referencia de cada objeto, abaixo por exemplo sem a sobrescrita do metodo retornaria falso, pois os objetos
         tem referencia diferente */

        Smarphone s1 = new Smarphone("1ABC2","iphone");
        Smarphone s2 = new Smarphone("1ABC2","iphone");
        System.out.println(s1.equals(s2));
    }
}
