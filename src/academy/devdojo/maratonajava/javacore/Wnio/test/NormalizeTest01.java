package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/Thiago/Dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1); // Não esta normalizado saida: home\Thiago\Dev\..\..\arquivo.txt
        System.out.println(path1.normalize()); // Apenas normaizando, nao garantindo a existencia do arquivo
        Path path2 = Paths.get("/home/./Thiago/./Dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
