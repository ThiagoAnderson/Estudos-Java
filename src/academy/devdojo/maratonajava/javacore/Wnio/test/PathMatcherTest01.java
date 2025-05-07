package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subspasta/file.pkp");
        Path path2 = Paths.get("pasta/subspasta/file.txt");
        Path path3 = Paths.get("pasta/subspasta/file.java");
        matches(path1,"glob:*.pkp");
        matches(path1,"glob:**.pkp");
        matches(path1,"glob:**/*.{pkp,txt,java}");
        matches(path2,"glob:**/*.{pkp,txt,java}");
        matches(path3,"glob:**/*.{pkp,txt,java}");
        matches(path1,"glob:**/*.???"); // três letras na extensão
        matches(path1,"glob:**/file.???"); // passando nome e terminando com 3 letras na extensao


    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob+": "+matcher.matches(path));
    }
}
