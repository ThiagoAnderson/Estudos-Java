package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformaceTest01 {
    public static void main(String[] args) {
        //
        long inicio = System.currentTimeMillis();
        concatString(1);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + " ms");

         inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer: " + (fim - inicio) + " ms");

    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i;
        }
    }
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
