package Ex4;
/*
Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.
* */


import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Casa casa = new Casa();
        Porta porta = new Porta();

        Scanner keyboardint = new Scanner(System.in);
        Scanner keyboardStr= new Scanner(System.in);

        System.out.println("Construindo sua casa...");

        for (int i=0; i <3; i++) {
            porta = new Porta();
            casa.addPortas(porta);
        }
        casa.imprimindoPortas(casa);

        System.out.println("Quantas vezes você deseja pintar sua casa?");
        int nC = keyboardint.nextInt();
        for (int i = 0; i < nC; i++) {
            System.out.println("Digite o nome da cor!");
            String cor = keyboardStr.nextLine();
            casa.pintandoCasa(casa, cor);
        }

        System.out.println("Quantas vezes você deseja pintar?\nDigite 0 se não quer pintar nenhuma porta!\tExemplo: digite x, você pintará x vez y porta.");
        int nP = keyboardint.nextInt();
        for (int i = 0; i < nP; i++) {
            System.out.println("Qual porta você deseja pintar?");
            int portaIDCor = keyboardint.nextInt();

            System.out.println("Digite o nome da cor!");
            String cor = keyboardStr.nextLine();
            casa.portas[portaIDCor-1].pintandoPorta(casa.portas[portaIDCor-1], cor);
        }

        System.out.println("Caso deseja alterar o estado da porta: [ABERTO X FECHADO]\nDigite qualquer número > 0");
        int value = keyboardint.nextInt();
        while (value > 0) {
            System.out.println("Qual porta você deseja alterar o estado");
            int portaIDEstado = keyboardint.nextInt();
            casa.portas[portaIDEstado-1].alterarEstadoPorta(keyboardint, casa.portas[portaIDEstado-1]);
            System.out.println("Caso deseja alterar o estado da porta: [ABERTO X FECHADO]\nDigite qualquer número > 0");
            value = keyboardint.nextInt();
        }

        System.out.println("A quantidade de portas abertas são: " + casa.quantasPortasEstaoAbertas());
        casa.imprimindoPortas(casa);
    }
}
