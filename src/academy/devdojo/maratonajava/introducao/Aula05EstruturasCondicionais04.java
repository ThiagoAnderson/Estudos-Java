package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double annualSalary = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.55 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if(annualSalary <= 37712){
            valorImposto = annualSalary * primeiraFaixa;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            valorImposto = annualSalary * segundaFaixa;
        }else{
            valorImposto = annualSalary * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
