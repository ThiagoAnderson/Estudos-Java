package academy.devdojo.maratonajava.javacore.ZZAclassesinternar.test;

public class OuterClassesTest01 {
    private String name = "Ichigo";
    //Nested
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this); // Se refere sempre a classe aquela que se encontra
            System.out.println(OuterClassesTest01.this); // Fazendo referencia ao this do objeto mais externo
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
