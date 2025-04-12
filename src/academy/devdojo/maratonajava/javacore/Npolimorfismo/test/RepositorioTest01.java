package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
