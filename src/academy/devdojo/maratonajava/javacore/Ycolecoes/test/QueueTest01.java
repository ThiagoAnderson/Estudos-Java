package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {

        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("B");
        fila.add("A");

        // Mostrar o primeiro elemento fila.peek();
        // Mostrar o primeiro elemento e remove fila.poll();
        // Remove o primeiro elemento  fila.remove();

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }

    }
}
