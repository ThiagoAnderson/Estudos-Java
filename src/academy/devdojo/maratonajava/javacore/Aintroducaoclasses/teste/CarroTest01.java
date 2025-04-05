package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Gol";
        carro.modelo = "Hibrido";
        carro.ano = 2022;
        System.out.println("Carro: "+carro.nome+" Modelo: "+carro.modelo+" Ano: "+carro.ano);

        System.out.println("---------------------");
        Carro carro2 = new Carro();
        carro2.nome = "HB20";
        carro2.modelo = "Convencional";
        carro2.ano = 2024;
        System.out.println("Carro: "+carro2.nome+" Modelo: "+carro2.modelo+" Ano: "+carro2.ano);

        //Carro esta fazendo referencia a carro2
        carro = carro2;


    }
}
