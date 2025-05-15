package academy.devdojo.maratonajava.javacore.ZZAclassesinternar.test;

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        // Classe que vão ser utilizadas brevemente no codigo e não são reutilizadas
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
