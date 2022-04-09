package Ex4;

import java.util.Scanner;

public class Porta {
    int id;
    boolean isPortaOpen = false;
    String cor = "Sem cor";


    public void alterarEstadoPorta(Scanner keyboard, Porta porta) {
        if (porta.isPortaOpen) {
            System.out.println("No momento essa porta está aberta!");
            System.out.println("Deseja fechar a porta\n1 - fechar\t0 para continuar aberta!");
            int opcao = keyboard.nextInt();
            if (opcao == 1) {
                porta.isPortaOpen = false;
                System.out.println("Porta fechado!");
            } else {

                System.out.println("Porta aberta!");
            }
        } else {
            System.out.println("No momento essa porta está fechada!");
            System.out.println("Deseja fechar a porta\n1 - continuar fechada\t0 - para abrir");
            int opcao = keyboard.nextInt();
            if (opcao == 1) {
                System.out.println("Porta fechado!");
            } else {
                porta.isPortaOpen = true;
                System.out.println("Porta aberta!");
            }
        }
    }
    public void pintandoPorta(Porta porta, String cor) {
        System.out.println("Cor anterior: "+ porta.cor);
        porta.cor = cor;
        System.out.println("Cor nova: "+ porta.cor);
    }

}
