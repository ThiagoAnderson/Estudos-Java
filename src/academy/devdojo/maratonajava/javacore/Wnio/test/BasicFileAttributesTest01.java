package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
       // BasicFileAttributes, DosFileAttributes, PosixFileAttributes

        //Alterando atributo de um arquivo, neste caso a data de modificação
        //1º Maneira
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        //2º Maneira
        Path path = Paths.get("pasta2/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,fileTime);
        // Verificações que podem ser feitas com o Files
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));
    }
}
