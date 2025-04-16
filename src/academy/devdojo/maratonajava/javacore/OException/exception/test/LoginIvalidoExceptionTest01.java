package academy.devdojo.maratonajava.javacore.OException.exception.test;

import academy.devdojo.maratonajava.javacore.OException.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginIvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {
        Scanner input = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário");
        String usernameDigitado = input.nextLine();
        System.out.println("Senha");
        String senhaDigitada = input.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha invalidos");
        } else {
            System.out.println("Usuário logado com sucesso!!");
        }
    }
}
