package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }
        //O attribute muda a forma dependendo do SO,essa por exemplo é apenas para Windows
        Files.setAttribute(path, "dos:hidden", true);
        Files.setAttribute(path, "dos:readonly", true);
        Files.setAttribute(path, "dos:hidden", false);
        Files.setAttribute(path, "dos:readonly", false);

        // Para descobrir se ele é um arquivo de leitura ou oculto utilizando Dos
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        // Para alterar os valores utilizase a interface que termina com View
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        // outra maneira de alterar os atributos
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());
    }
}
