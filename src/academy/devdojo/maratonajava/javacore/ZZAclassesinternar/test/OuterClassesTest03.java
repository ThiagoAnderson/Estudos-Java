package academy.devdojo.maratonajava.javacore.ZZAclassesinternar.test;

public class OuterClassesTest03 {
    private String name = "Thiago";
   static class Nested{
        void print(){
            System.out.println(new OuterClassesTest03().name); // Não é possivel acessar o name diretamente, pois ele não é estatico
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
