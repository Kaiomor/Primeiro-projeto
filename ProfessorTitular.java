package ExercEntregar.ExercEntregar;

public class ProfessorTitular extends Professor {
    private String especialidade;

    public ProfessorTitular(String especialidade,String nome, String sobrenome, int tempodeCasa, int codigoProfessor) {
        super (nome, sobrenome,tempodeCasa,codigoProfessor);
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
