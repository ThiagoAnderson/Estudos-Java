package academy.devdojo.maratonajava.javacore.OException.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws  LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionario");
    }
}
