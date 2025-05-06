package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Paths.get("home/Thiago"); // Caminho relativo
        Paths.get("/home/Thiago"); // Caminho absoluto, indo desde a raiz ate o desejado

        Path dir = Paths.get("home/Thiago");
        Path arquivo = Paths.get("Dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/Thiago");
        Path relativo = Paths.get("Dev");
        Path file = Paths.get("file.txt");

        System.out.println("1 "+absoluto.resolve(relativo));
        System.out.println("2 "+absoluto.resolve(file));
        System.out.println("3 "+relativo.resolve(absoluto));
        System.out.println("4 "+relativo.resolve(file));
        System.out.println("5 "+file.resolve(absoluto));
        System.out.println("6 "+file.resolve(relativo));

    }
}
