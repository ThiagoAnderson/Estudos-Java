package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smarphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smarphone s1 = new Smarphone("1ABC2", "iphone");
        Smarphone s2 = new Smarphone("2222", "pixel");
        Smarphone s3 = new Smarphone("3333", "samsung");
        List<Smarphone> smarphones = new ArrayList<>();
        smarphones.add(s1);
        smarphones.add(s2);
        smarphones.add(0,s3); // Adiciona diretamente no indice

        // smarphones.clear(); -  Deleta todos que estão dentro do ArrayList

        for (Smarphone smarphone : smarphones){
            System.out.println(smarphone.toString());
        }
        Smarphone s4 = new Smarphone("2222", "pixel");

        System.out.println(smarphones.contains(s4)); // retorna true ou false para ver se o objeto existe dentro da Lista


        int indexPhone4 = smarphones.indexOf(s4);// Traz o indice daquele objeto, e -1 caso ele nao exista
        System.out.println(indexPhone4);


    }
}
