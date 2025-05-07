package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
// Zippa arquivos, utilizamos o DirectoryStream para acessar esses arquivos já que temos o path, mas poderia ser com o SimpleVisitor também
public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta01/subsubpasta01");
        zip(arquivoZip,arquivosParaZipar);
    }
    private static void zip(Path arquivoZip, Path arquivosParaZipar){
            try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)){
                for(Path file: directoryStream){
                    ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                    zipStream.putNextEntry(zipEntry);
                    Files.copy(file,zipStream);
                    zipStream.closeEntry();
                }
                System.out.println("Arquivo zipado com sucesso!");
            }catch (IOException e){
                e.printStackTrace();
            }
    }
}
