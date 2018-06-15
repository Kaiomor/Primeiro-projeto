package ExercEntregar.ExercEntregar;

public class ProfessorAdjunto extends Professor {

    private int quantidadeMaxima;



    public ProfessorAdjunto(int quantidadeMaxima,String nome, String sobrenome, int tempodeCasa, int codigoProfessor) {
        super(nome,sobrenome, tempodeCasa, codigoProfessor);
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public int getquantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeMaxima = quantidadeMaxima;
    }
}
