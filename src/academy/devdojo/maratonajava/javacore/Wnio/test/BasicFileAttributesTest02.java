package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/novo_path.txt");
        // Apenas leitura
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creation = basicFileAttributes.creationTime();
        FileTime lastAcess = basicFileAttributes.lastAccessTime();
        FileTime lastModified = basicFileAttributes.lastModifiedTime();

        System.out.println("creation Time:" + creation);
        System.out.println("last acess Time: " + lastAcess);
        System.out.println("last Modified Time" + lastModified);

        System.out.println("-------------------");

        // terminou em View é a indicação que esse tipo de classe permite a edição
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastAcess, newCreationTime, creation);

        creation = fileAttributeView.readAttributes().creationTime();
        lastAcess = fileAttributeView.readAttributes().lastAccessTime();
        lastModified = fileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("creation Time:" + creation);
        System.out.println("last acess Time: " + lastAcess);
        System.out.println("last Modified Time" + lastModified);
    }
}
