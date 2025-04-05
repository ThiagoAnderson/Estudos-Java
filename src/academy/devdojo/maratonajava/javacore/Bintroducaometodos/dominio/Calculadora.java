package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }


    // num1 e num2 são parametros
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divisaoDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
            return num1/num2;
        } else {
            return 0;
        }
    }
    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if(num2 ==0){
            System.out.println("Nao existe divisão por 0");
            // ou tira o else e coloca um return; que funciona apenas em metodos void
        }else{
            System.out.println(num1/num2);
        }
    }
    public void alteraDoisNumeros(int num1,int num2){
        num1 = 99;
        num2= 33;
        System.out.println("Dentro do altera dois numeros:");
        System.out.println(num1);
        System.out.println(num2);
    }
    //Ambas as duas abaixo funcionam da mesma forma, facilitando apenas a chamada da função
    public  void somaArray(int[] array){
        int soma =0;
        for(int num : array){
            soma += num;
        }
        System.out.println(soma);
    }
    // VarArgs so funciona com varios atributos se ele for o ultimo da chamada
    public void somaVarArgs(int... numeros){
        int soma =0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
