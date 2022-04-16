package sistemaAcademico;

public class Disciplina {
    private String nome;
    private String codigoDisciplina;
    private String tipoDisciplina;
    private String preRequisito;
    private String ementaDisciplina;
    private int periodoDisciplina;
    private int cargaHorariaTeorica;
    private int cargaHorariaPratica;
    private int cargaHorariaTotal;

    public String getEmentaDisciplina() {
        return this.ementaDisciplina;
    }
}
