package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Porche", 275);
        Carro c3 = new Carro("Ferrari Aviator", 290);
        Carro.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
