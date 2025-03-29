package models;

public class Disciplina {
    private String nomeDisciplina;
    private int cargaHorariaDisciplina;
    private Professor professor;

    public Disciplina(String nomeDisciplina, int cargaHorariaDisciplina, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCargaHorariaDisciplina() {
        return cargaHorariaDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", cargaHorariaDisciplina=" + cargaHorariaDisciplina +
                ", professor=" + professor +
                '}';
    }
}
