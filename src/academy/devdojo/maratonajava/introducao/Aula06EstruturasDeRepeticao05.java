package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valor = 30000;
        for(int parcela = (int)valor; parcela >= 1; parcela--) {
            double valorParcela = valor/parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela +" R$ "+ valorParcela);

        }
    }
}
