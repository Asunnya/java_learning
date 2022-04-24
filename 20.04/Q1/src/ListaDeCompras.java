/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Aluno
 */
public class ListaDeCompras {
    private String nome;
    private ArrayList<String> listaDeCompras = new ArrayList<String>();

    public void addCompras(String nome) {
        if (!listaDeCompras.contains(nome)) {
            listaDeCompras.add(nome);
        }
    }

    public void imprimeCompras() {
        Collections.sort(listaDeCompras);
        System.out.println("--------------- LISTA DE COMPRAS -----------------------");
        for (int i = 0; i < listaDeCompras.size(); i++) {
            System.out.println("Item " + i + ": " + listaDeCompras.get(i));
        }
    }
}


