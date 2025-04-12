package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Rukia", 3000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Renji", 7200);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        // A classe abstrata Funcionario implementou o metodo abstrato de pessoa, logo as classes filhos herderam da classe funcionario
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
