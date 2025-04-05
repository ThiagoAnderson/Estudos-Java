package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Thiago";
        professor.idade = 22;
        professor.sexo = 'M';
        System.out.println("Nome: "+professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
