package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTeclado02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou nao");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NÃO");
        }
    }
}
