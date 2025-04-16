package academy.devdojo.maratonajava.javacore.OException.exception.test;

import academy.devdojo.maratonajava.javacore.OException.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.OException.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.OException.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
