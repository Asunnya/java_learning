package Ex4;

import java.util.Scanner;

public class Porta {
    private int id;
    private boolean isPortaOpen = false;
    private String cor = "Sem cor";

    public Porta(int qtdePortas) {
        this.id = qtdePortas + 1;
        this.cor = "Sem cor";
    }

    public boolean isPortaOpen() {
        return this.isPortaOpen;
    }

    public int getId() {
        return this.id;
    }

    public String getCor() {
        return this.cor;
    }

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
