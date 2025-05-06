package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta"); // new File(pasta)
        if(Files.notExists(pastaPath)) {
            Files.createDirectory(pastaPath); // cria uma pasta dentro do arquivo raiz do programa apenas se a pasta raiz existir
            }
        Path subPastaPath = Paths.get("pasta/subpasta/subpasta");
        Files.createDirectories(subPastaPath); // Se a pasta raiz não existir, ele vai criar uma e não lança exceção caso nao exista o diretorio
        Path filePath = Paths.get(subPastaPath.toString(),"file.txt");
        if(Files.notExists(filePath)) {
            // Lança exception se já tiver criado
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        // getParent pega a pasta pai do arquivo de filePath, no caso seria a ultima subpasta
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt");
        Files.copy(source,target);
        // REPLACE_EXISTING copia o coteudo do arquivo fonte para o novo arquivo
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
