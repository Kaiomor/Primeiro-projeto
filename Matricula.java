package ExercEntregar.ExercEntregar;

import javax.xml.crypto.Data;
import java.util.Date;

public class Matricula {

    Date dataDoDia = new Date();

    public String nome;
    public String curso;
    public Data data;


    public Matricula(Date dataDoDia, String nome, String curso, Data data) {
        this.dataDoDia = dataDoDia;
        this.nome = nome;
        this.curso = curso;
        this.data = data;

    }
}
