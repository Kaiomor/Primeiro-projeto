package ExercEntregar.ExercEntregar;

public class Professor {


    private String nome;
    private String sobrenome;
    private int tempodeCasa;
    private int codigoProfessor;

    public Professor(String nome, String sobrenome, int tempodeCasa, int codigoProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempodeCasa = tempodeCasa;
        this.codigoProfessor = codigoProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getTempodeCasa() {
        return tempodeCasa;
    }

    public void setTempodeCasa(int tempodeCasa) {
        this.tempodeCasa = tempodeCasa;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }
}
