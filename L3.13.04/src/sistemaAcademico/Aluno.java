package sistemaAcademico;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sistemaAcademico.Aluno
 */
public class Aluno {
    private String nome;
    private String numeroDeMatricula;
    private int coeficienteRendimento;
    private int inicioMatricula;

    public void setCoeficienteRendimento() {
        this.coeficienteRendimento = Inscricao.calculaCR(this);
    }

}
