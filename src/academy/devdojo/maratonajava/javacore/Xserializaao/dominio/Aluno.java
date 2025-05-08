package academy.devdojo.maratonajava.javacore.Xserializaao.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = 2914964592968678376L;
    private int id;
    private String nome;
    private transient Turma turma;
    // O atributo não sera serializado com o transientA
    private transient String password;
    // Atributos estaticos nao sao serializados

    public Aluno(int id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
