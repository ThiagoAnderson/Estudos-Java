package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("591234-111");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kurosaki ichigo");
        pessoa.setCPF("19442000");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Juninho");
        funcionario.setCPF("1235662");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1300);

        funcionario.imprime();

    }
}
