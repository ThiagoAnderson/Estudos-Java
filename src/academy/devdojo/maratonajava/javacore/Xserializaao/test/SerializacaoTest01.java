package academy.devdojo.maratonajava.javacore.Xserializaao.test;

import academy.devdojo.maratonajava.javacore.Xserializaao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializaao.dominio.Turma;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(21, "Thiago", "123456788");
        Turma turma = new Turma("Em breve dev");
        aluno.setTurma(turma);
        serializar(aluno);
        desSerializar();

        /* Serialização é a técnica que permite transformar o estado de um objeto em uma sequência de Bytes, depois
         de serializado ele pode ser persistido em um arquivo de dados e recuperado por deserialização para recriar o
         objeto na memória*/
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desSerializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

