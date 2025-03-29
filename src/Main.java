import models.*;

public class Main {
    public static void main(String[] args) {

        Escola escola = new Escola("Escola Senai");

        Aluno aluno1 = new Aluno("Carlos Silva", 15, "A123");
        Aluno aluno2 = new Aluno("Mariana Souza", 16, "A456");
        Aluno aluno3 = new Aluno("Maria Souza", 16, "B456");
        Aluno aluno4 = new Aluno("Pedro Souza", 26, "P456");

        Professor professor1 = new Professor("João Pereira", "Matemática", 55);
        Professor professor2 = new Professor("Ana Costa", "Português", 45);
        Professor professor3 = new Professor("Pedro Costa", "Java", 36);
        Professor professor4 = new Professor("Ana Maria", "Português", 47);

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);
        escola.adicionarAluno(aluno4);

        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);
        escola.adicionarProfessor(professor3);
        escola.adicionarProfessor(professor4);

        escola.listaDeAluno();

        System.out.println("--------------------------------------------------------------------------------------------");

        escola.listaDeProfessores();


        Turma turma = new Turma("Java", 2025, professor1);
        Disciplina disciplina = new Disciplina("TI", 80, professor1);


    }
}