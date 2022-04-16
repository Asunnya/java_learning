/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Scanner keyboardint = new Scanner(System.in);
        Scanner keyboardStr = new Scanner(System.in);

        Porta porta = new Porta(1);
        System.out.println("Foi adquirido uma nova porta por voce!");

        System.out.println("Quantas vezes você deseja pintar sua porta?");
        int n = keyboardint.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da cor!");
            String cor = keyboardStr.nextLine();
            porta.pintandoAPorta(porta, cor);
        }
        System.out.println("Caso deseja alterar o estado da porta: [ABERTO X FECHADO]\nDigite qualquer número > 0");
        int value = keyboardint.nextInt();
        while (value > 0) {
            alterarEstadoPorta(keyboardint, porta);
            System.out.println("Caso deseja alterar o estado da porta: [ABERTO X FECHADO]\nDigite qualquer número > 0");
             value = keyboardint.nextInt();
        }


        System.out.println("As dimensões da porta são padrões 72x210!\nCaso deseja alterar a dimensão da porta\nDigite qualquer número > 0");
        int valueDim = keyboardint.nextInt();
        while (valueDim > 0) {
            alterarDim(porta, keyboardStr);
            System.out.println("Caso deseja alterar a dimensão da porta\nDigite qualquer número > 0");
            valueDim = keyboardint.nextInt();
        }
        porta.imprimirPorta(porta);
    }

    public static void alterarEstadoPorta(Scanner keyboard, Porta porta) {
        if (porta.isPortaOpen()) {
            System.out.println("No momento essa porta está aberta!");
            System.out.println("Deseja fechar a porta\n1 - fechar\t0 para continuar aberta!");
            int opcao = keyboard.nextInt();
            if (opcao == 1) {
                porta.setPortaOpen(false);
                System.out.println("Porta fechado!");
            } else {
                System.out.println("Porta aberta");
            }
        } else {
            System.out.println("No momento essa porta está fechada!");
            System.out.println("Deseja fechar a porta\n1 - continuar fechada\t0 - para abrir");
            int opcao = keyboard.nextInt();
            if (opcao == 1) {
                System.out.println("Porta fechado!");
            } else {
                porta.setPortaOpen(false);
                System.out.println("Porta aberta");
            }
        }
    }

    public static void alterarDim(Porta porta, Scanner keyboard) {
        System.out.println("Digite as dimensões da porta!OS VALORES DEVEM SER EM CM\n[EXEMPLO] 72x210\nNESSE EXEMPLO, 72 É A LARGURA E 210 É A ALTURA, EM CM!");
        porta.setDim(keyboard.nextLine());
    }
}
