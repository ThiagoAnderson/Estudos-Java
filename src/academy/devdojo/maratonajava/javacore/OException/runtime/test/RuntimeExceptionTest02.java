package academy.devdojo.maratonajava.javacore.OException.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }
    public static int divisao(int a, int b){
        if(b == 0) {
            throw new IllegalArgumentException("Argumento invalido, não pode ser 0");
        }
        return  a/b;
    }
}
