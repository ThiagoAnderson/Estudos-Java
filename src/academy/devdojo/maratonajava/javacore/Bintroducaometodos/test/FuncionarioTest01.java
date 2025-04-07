package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Thiago");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{2200,1300,1600});
        funcionario.imprimeDados();
        System.out.println("Media: "+funcionario.getMedia());
    }
}
