package academy.devdojo.maratonajava.javacore.OException.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando pessoa");
    }
}
