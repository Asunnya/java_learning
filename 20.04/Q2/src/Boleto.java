
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Aluno
 */
public class Boleto {
    private String codigo;
    private String date;
    private double valor;

    public Boleto(String codigo, String date, double valor) {
        this.valor = valor;
        this.date = date;
        this.codigo = codigo;

    }

    public String getCodigo() {
        return this.codigo;
    }

    public double getValor() {
        return this.valor;
    }


}
