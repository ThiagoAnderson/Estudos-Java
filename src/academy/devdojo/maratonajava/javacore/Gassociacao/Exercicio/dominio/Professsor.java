package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.dominio;

public class Professsor {
    private  String nome;
    private  String especialidade;
    private  Seminario[] seminarios;

    public Professsor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }
    public void imprime(){
        System.out.println("Nome professor: "+ this.nome);
        System.out.println("Especialidade professor: " + this.especialidade);
        if(seminarios == null){
            return;
        }
        for (Seminario seminario : seminarios){
            System.out.println("Nome do seminario: "+seminario.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
