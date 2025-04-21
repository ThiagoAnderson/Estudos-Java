package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Criado "+isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("path "+file.getAbsolutePath());
            System.out.println("é um diretorio "+file.isDirectory());
            System.out.println("é um arquivo "+file.isFile());
            System.out.println("esta escondido "+file.isHidden());
            System.out.println("modificado "+new Date(file.lastModified()));

            boolean exists = file.exists();
            if(exists){
                boolean isDeleted = file.delete();
                System.out.println("Deletado "+isDeleted);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
