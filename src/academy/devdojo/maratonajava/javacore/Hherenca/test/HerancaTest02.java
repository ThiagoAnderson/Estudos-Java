package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estatico da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estatico da sub classe é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memoria pro objeto da classe superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valor default ou oque for passado
    // 4 - Bloco de Inicialização da superclasse Executado na ordem em que aparece
    // 5 - Construtor Executado da superclasse
    // 6 - Alocado espaço em memoria pro objeto da classe subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valor default ou oque for passado
    // 8 - Bloco de Inicialização da subclasse Executado na ordem em que aparece
    // 9 - Construtor Executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Thiago");
    }
}
