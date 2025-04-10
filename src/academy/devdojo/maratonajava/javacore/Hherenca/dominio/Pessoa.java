package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

public class Pessoa {
    protected String nome;
    protected String CPF;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco estatico de pessoa");
    }
    {
        System.out.println("Dentro do bloco inicializaçao  de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco estatico de pessoa 2");
    }

    public Pessoa(String nome ){
        System.out.println("Dentro construtor de pessoa");
        this.nome = nome;
    }
    public Pessoa(String nome,String CPF){
        this(nome);
        this.CPF = CPF;
    }
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.CPF);
        System.out.println(endereco.getCep() + " " + endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
