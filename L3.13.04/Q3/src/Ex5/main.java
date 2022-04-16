package Ex5;

/*
*  Escreva uma classe Televisao sabendo que o estado de uma televisão se caracteriza por estar ligada ou desligada,
*  pelo volume (que está entre 0 e 10), pelo canal (que está entre 0 e 99) e pelo fato de estar em modo silencioso ou não.
*  Crie métodos para ligar/desligar a televisão, mudar o canal (canal específico, canal anterior, próximo canal) e silenciar a televisão.
*  Instancie um objeto dessa classe, utilize seus métodos para mudar de canal, ligar e desligar a TV, silenciar ou dessilenciar a TV e, por último, imprima o estado da TV. */

import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        Scanner keyboardint = new Scanner(System.in);
        Scanner keyboardStr = new Scanner(System.in);

        System.out.println("[1] LIGAR A TV");
        int op = keyboardint.nextInt();
        if (op == 1) {
            tv.ligarTV();
            while (op != 0) {
                System.out.println("APERTE QUALQUER VALOR > 0 PARA ENTRAR NO MENU DE CANAIS");
                int opMenuCanal = keyboardint.nextInt();
                while (opMenuCanal > 0) {
                    tv.menuCanal(keyboardint);
                    opMenuCanal = keyboardint.nextInt();
                }

                System.out.println("APERTE [1] PARA MUTAR OU DESMUTAR A TELEVISAO!\tAPERTE[0] PARA NAO MUDAR!\n[EXEMPLO FUNCIONAMENTO] SILENCIADO -> DESILENCIAR\tDESILENCIADO -> SILENCIAR");
                int opSom = keyboardint.nextInt();
                if (opSom == 1) {
                    tv.muteTV();
                }

                System.out.println("APERTE [+]:AUMENTAR O VOLUME!\tAPERTE [-]: ABAIXAR O VOLUME\tAPERTE [0]: NAO MUDAR VOLUME");
                String opVolume = keyboardStr.nextLine();
                if (!Objects.equals(opVolume, "0")) {
                    System.out.println("VOLUME ANTERIOR " + tv.getVolume());
                    if (tv.changeVolume(opVolume)) {
                        System.out.println("VOLUME ATUAL " + tv.getVolume());
                    }
                }

                System.out.println("[0] PARA DESLIGAR!");
                op = keyboardint.nextInt();
                tv.imprimirTv();
            }
            tv.imprimirTv();
            tv.ligarTV();
            tv.imprimirTv();
        }

    }

}
