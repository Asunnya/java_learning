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
        private int id;
        private boolean isPortaOpen = false;
        private String cor = "Sem cor";
        private String dim = "72x210";

        public Porta(int id) {
           this.id = id;
        }

        protected boolean isPortaOpen() {
            return this.isPortaOpen;
        }

        protected void setDim(String dim) {
            this.dim = dim;
        }

        protected void setPortaOpen(boolean portaOpen) {
            this.isPortaOpen = portaOpen;
        }

        protected void pintandoAPorta(Porta porta, String cor) {
               System.out.println("Cor anterior: "+ porta.cor);
               porta.cor = cor;
               System.out.println("Cor nova: "+ porta.cor);
           }

        protected void imprimirPorta(Porta porta) {
               System.out.println("ID: "+ porta.id);
               System.out.println("Cor: "+ porta.cor);
               System.out.printf("Dimensões: %s cm\n", porta.dim);
               if (this.isPortaOpen) {
                   System.out.println("Porta aberta!");
               } else {
                   System.out.println("Porta fechada!");
               }
           }

}
