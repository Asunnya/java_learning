/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

/**
 *
 * @author Aluno
 */
public class Porta {
       int id;
       boolean isPortaOpen = false;
       String cor = "Sem cor";
       String dim = "72x210";
       
       
       public boolean estaAberta(Porta porta) {
            return porta.isPortaOpen;
       }
       public void pintandoAPorta(Porta porta, String cor) {
           System.out.println("Cor anterior: "+ porta.cor);
           porta.cor = cor;
           System.out.println("Cor nova: "+ porta.cor);
       }
       public void imprimirPorta(Porta porta) {
           System.out.println("ID: "+ porta.id);
           System.out.println("Cor: "+ porta.cor);
           System.out.printf("Dimensões: %s cm\n", porta.dim);
           if (isPortaOpen) {
               System.out.println("Porta aberta!");
           } else {
               System.out.println("Porta fechada!");
           }
       }

}
