package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Zico");
        Jogador jogador3 = new Jogador("Ronaldinho");
        Jogador[] jogadores = new Jogador[]{jogador,jogador2,jogador3} ;

        for (Jogador j: jogadores){
            j.imprime();
        }
    }
}
