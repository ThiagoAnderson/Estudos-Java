package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        // int, double, float, chat, byte, short, long, boolean
        int age = 100;
        long longNumber = 10000L;
        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0F;
        byte ageByte = -128;
        short ageShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char charactere = 'a';

        // Cast de uma váriavel primitiva maior para uma menor: (tipo) valor

        System.out.println("A idade é: " + age);
        System.out.println(verdadeiro);
        System.out.println(charactere);

        //String não é um tipo primitivo, é uma classe ou seja letra maiuscula no inicio.
        String name = "Thiago";
        System.out.println("Oi meu nome é "+name);
    }
}
