package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
       /* List nomes = new ArrayList(); // Versao 1.4 Java
        nomes.add("Thiago");
        nomes.add("Anderson");
        nomes.add(121);

        for (Object nome: nomes){
            System.out.println(nome);
        }
        */
        List<String> nomes = new ArrayList(); // 1.5 em diante
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Thiago");
        nomes.add("Anderson");
        nomes.remove("Thiago"); // Pode remover por indice ou por objeto
        nomes2.add("Exemplos");
        nomes2.add("Test");

        nomes.addAll(nomes2); // Adicionando uma lista na outra

        for (String nome: nomes){
            System.out.println(nome);
           //  nomes.add("Mendes"); Vai gerar uma Exception, pois não é possivel alterar dinamicamente dentro de um loop
        }
        System.out.println("-------");
        int size = nomes.size();
        for (int i = 0; i < nomes.size()/*Para dar certo : use size numa variavel*/; i++) {
            System.out.println(nomes.get(i));
            // nomes.add("Mendes"); Vai adicionar infinitamente pois o valor do tamanho esta sendo aumentado a cada chamada
        }

        System.out.println(nomes); // impressao padrão da lista

        //Listar so funcionam com objetos, ou seja não é possivel utilizar por exemplo List<int>, se deve utilizar os Wrapers
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
