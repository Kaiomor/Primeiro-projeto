package ExercEntregar.ExercEntregar;


import java.util.List;


public class DigitalManager{

    List<Professor> professor;
    List<Aluno> aluno;
    List<Curso> curso;
    List<Matricula> Matricula;

    public void registrarCurso(){

    }

public void registrarCurso(String nomeCurso,int codigoCurso,int quantidadeMaxima){
    Curso fullstack = new Curso();
    fullstack.setNomedoCurso(nomeCurso);
    fullstack.setQuantidadeMaxima(quantidadeMaxima);
    fullstack.setCodigo(codigoCurso);

    curso.add(fullstack);

}

    public void excluirCurso(Integer codigoCurso){
    curso.remove(codigoCurso);
}
public void regustrarProfessorAdjunto(){

}
    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
    ProfessorAdjunto profSubstituto = new ProfessorAdjunto(quantidadeDeHoras,nome,sobrenome,0,codigoProfessor);


    }
    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular professorTitular = new ProfessorTitular(especialidade,nome,sobrenome,codigoProfessor,0);

    }
    public void excluirProfessor(Integer codigoProfessor){
        professor.remove(codigoProfessor);
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno aluno = new Aluno(nome,sobrenome,codigoAluno);

        }

        public void matricularAluno(Integer codigoAluno, Integer codigoCurso){

        }
    }



