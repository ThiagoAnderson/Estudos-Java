package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;
// Provém um contrato para implementação
public interface DataLoader {
    // todos os atributos sao constantes
    public static final int MAX_DATA_SIZE =  10;
    public abstract void load();
    default void checkPermission(){
        System.out.println("Fazendo checkagem de permissoes");
    }

    public static  void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
