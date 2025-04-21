package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("folder");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isCriado = fileArquivoDiretorio.createNewFile();
        System.out.println(isCriado);
        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenomeado = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenomeado);

        File diretorioRenomeado = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenomeado);
        System.out.println(isDiretorioRenomeado);
    }
}
