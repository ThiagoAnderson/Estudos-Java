package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;
//Se eu colocar final, a classe nunca podera ser extendida
public  class Carro {
    private String nome;
    // Constantes tem convenção própria
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    // com a palavra final, este metodo nunca podera ser sobrescrito
    public final void imprime(){
        System.out.println(this.nome);
    }
    public Carro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}