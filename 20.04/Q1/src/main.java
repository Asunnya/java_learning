
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Aluno
 */

public class main {
    public static void main(String[] args) {
        Scanner keyboardStr = new Scanner(System.in);
        ListaDeCompras lista1 = new ListaDeCompras();

        String item;

        System.out.println("Digite o nome do item. Para ser adicionado em sua Lista de Compras!\nCaso queira finalizar, digite end");
        item = keyboardStr.next();


        while (!"end".equals(item)) {
            lista1.addCompras(item);
            item = keyboardStr.next("\n");
        }

        lista1.imprimeCompras();

    }
}
