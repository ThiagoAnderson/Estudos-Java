package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario : salarios){
            System.out.println(salario);
        }
        mediaSalarios(salarios);
    }
    public void mediaSalarios(double[] salarios){
        double somaSalarios = 0;
        for(double salario: salarios){
            somaSalarios+= salario;
        }
        double mediaSalarios = somaSalarios / salarios.length;
        System.out.println("Media salarial: " + mediaSalarios);
    }
}
