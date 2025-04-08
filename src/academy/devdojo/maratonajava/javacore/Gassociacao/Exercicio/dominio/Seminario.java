package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(Local local, String titulo) {
        this.local = local;
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this(local,titulo);
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println("Nome do seminário: "+this.titulo);
        System.out.println("Local do seminário: "+local.getEndereco());
        if(alunos == null){
            System.out.println("Não há alunos");
        }else{
            for (Aluno aluno : alunos){
                System.out.println("Aluno:"+aluno.getNome());
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
