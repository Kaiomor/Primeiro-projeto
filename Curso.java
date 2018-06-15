package ExercEntregar.ExercEntregar;

import java.util.List;


public class Curso {

    private  String nome;
    private int codigo;
    private int quantidadeMaxima;
    public ProfessorTitular professorTitular;
    public ProfessorAdjunto professorAdjunto;
    List<Aluno>aluno;
    List<Professor> professor;
    List<Curso> curso;
    List<ExercEntregar.ExercEntregar.Matricula> Matricula;



    public String getNome() {
        return nome;
    }

    public void setNomedoCurso(String nomedoCurso) {
        this.nome = nomedoCurso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;

    }

    public boolean adicionarUmAluno(Aluno umaluno) {

        if (aluno.size() < quantidadeMaxima) {
            aluno.add(umaluno);
            return true;

        }else{
            System.out.println("Não há vagas !");
            return false;

        }

    }
    public void excluirAluno(Aluno umaluno){

        aluno.remove(umaluno);

    }
    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){


    }
}


