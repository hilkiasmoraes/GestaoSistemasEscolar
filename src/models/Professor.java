package models;

public class Professor {
    private String nomeProfessor;
    private String disciplinaProfessor;
    private int idadeProfessor;

    public Professor(String nomeProfessor, String disciplinaProfessor, int idadeProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.disciplinaProfessor = disciplinaProfessor;
        this.idadeProfessor = idadeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setDisciplinaProfessor(String disciplinaProfessor) {
        this.disciplinaProfessor = disciplinaProfessor;
    }

    public void setIdadeProfessor(int idadeProfessor) {
        this.idadeProfessor = idadeProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nomeProfessor='" + nomeProfessor + '\'' +
                ", disciplinaProfessor='" + disciplinaProfessor + '\'' +
                ", idadeProfessor=" + idadeProfessor +
                '}';
    }
}