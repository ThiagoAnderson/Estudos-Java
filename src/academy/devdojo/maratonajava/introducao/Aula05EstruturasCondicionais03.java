package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        String menssagemDoar = "Eu vou doar 500 pro DevDojo";
        String menssagemNaoDoar = "Ainda nao tenho condições, mas vou ter";
        //(condicao) ? verdadeiro : falso;
        String resultado = (salario > 5000) ? menssagemDoar : menssagemNaoDoar;

        System.out.println(resultado);
    }
}

