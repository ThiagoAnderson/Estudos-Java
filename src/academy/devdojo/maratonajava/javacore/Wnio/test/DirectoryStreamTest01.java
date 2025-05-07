package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        // Listando todos os arquivos de um directory
        Path dir = Paths.get(".");
        // try with resources para fechar o recurso que o sistema vai utilizar
        try(DirectoryStream<Path> stream= Files.newDirectoryStream(dir)){
            for (Path path: stream){
                System.out.println(path.getFileName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
