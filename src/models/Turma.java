package models;

import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private int anoLetivo;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeTurma, int anoLetivo, Professor professor) {
        this.nomeTurma = nomeTurma;
        this.anoLetivo = anoLetivo;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nomeTurma='" + nomeTurma + '\'' +
                ", anoLetivo=" + anoLetivo +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }
}