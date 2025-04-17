package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Thiago";
        nome.concat(" Anderson");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder(nome); // Não é imutavel
        sb.append(" aprendendo java");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
