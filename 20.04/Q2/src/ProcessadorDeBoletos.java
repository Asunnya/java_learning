
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Aluno
 */
public class ProcessadorDeBoletos {


    public static double sumListaBoletos(ArrayList<Boleto> boletos) {
        double sum = 0;
        for (int i = 0; i < boletos.size(); i++) {

            sum += boletos.get(i).getValor();

        }
        return sum;
    }


}
