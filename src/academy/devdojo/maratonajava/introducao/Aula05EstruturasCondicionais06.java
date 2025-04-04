package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia util ou fim de semana
        // Considerando 1 como domingo
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Dia util");
                break;
            case 2:
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Dia util");
                break;
            case 5:
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }
}
