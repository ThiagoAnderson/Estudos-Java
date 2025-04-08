package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.dominio.Professsor;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.dominio.Seminario;

public class Exercicio01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Cajazeiras");
        Seminario seminario1 = new Seminario(local,"Vida fora da terra?");
        Aluno aluno1 = new Aluno("Thiago",22,seminario1);
        Professsor professsor = new Professsor("Giuberto","Astronomia", new Seminario[]{seminario1});



        professsor.imprime();
        System.out.println("----------");
        aluno1.imprime();
        System.out.println("----------");
    }
}
