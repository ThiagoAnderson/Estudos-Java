package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Thiago"; // String  constant pool
        String nome2 = "Thiago";
        nome = nome.concat(" Anderson"); // atribuindo o valor a nome, ele passa a referenciar nome com a concat
        System.out.println(nome);
        System.out.println(nome == nome2); // Comparando a referencia
        String nome3 = new String("Thiago"); // 1 váriavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3); //
        System.out.println(nome2 == nome3.intern()); // Agora o nome 2 esta sendo comparado ao nome dentro do pool de Strings

        // Strings Imutaveis é necessario ter cuidado a associar um novo valor a váriavel de referencia.
    }
}
