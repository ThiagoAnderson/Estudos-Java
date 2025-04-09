package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

public class Pessoa {
    protected String nome;
    protected String CPF;
    protected Endereco endereco;

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
