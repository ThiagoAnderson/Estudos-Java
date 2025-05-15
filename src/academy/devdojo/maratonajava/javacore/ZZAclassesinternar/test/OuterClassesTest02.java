package academy.devdojo.maratonajava.javacore.ZZAclassesinternar.test;

public class OuterClassesTest02 {
    private String name = "Klein";
    void print(){
        String lastName = "Moretti";
        //Local Class
        class LocalClass{ // Ela pode ser abstract ou final
            public void printLocal(){
                System.out.println(name + "" + lastName);
            }
        }
        // Unica forma de utilizar as classes locais, instanciando diretamente no metodo
        new LocalClass().printLocal();

    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();

    }
}
