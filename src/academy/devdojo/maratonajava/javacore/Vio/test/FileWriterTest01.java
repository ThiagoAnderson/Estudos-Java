package academy.devdojo.maratonajava.javacore.Vio.test;
// file
// fileWriter
// fileReader
// BufferedWriter
// BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)){ // Se quiser ir adicionando textos ao arquivo
            fw.write(" O DevDojo é melhor curso de Java");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
