package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario : salarios){
            System.out.println(salario);
        }
        mediaSalarios(salarios);
    }
    public void mediaSalarios(double[] salarios){
       if(salarios == null){
           return;
       }
       for(double salario : salarios){
           this.media += salario;
       }
       this.media /= salarios.length;
        System.out.println("Média salarial: "+this.media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
