package Ex5;

import java.util.Objects;
import java.util.Scanner;

public class Televisao {
    boolean isPowerOn = false;
    int volume = 5;
    int canal = 0;
    boolean isSileced = false;

    public void ligarTV(Televisao televisao) {
        if (televisao.isPowerOn) {
            televisao.isPowerOn = false;
        } else {
            televisao.isPowerOn = true;
        }
    }

    public void muteTV(Televisao televisao) {
        if (televisao.isSileced) {
            televisao.isSileced = false;
        } else {
            televisao.isSileced = true;
        }
    }

    public void changeCanalEsp(Televisao televisao, int canalDesejado) {
        televisao.canal = canalDesejado;
    }

    public void changeCanalProx(Televisao televisao) {
        if (televisao.canal == 99) {
            televisao.canal = 0;
        } else {
            televisao.canal++;
        }
    }

    public void changeCanalAnt(Televisao televisao) {
        if (televisao.canal == 0) {
            televisao.canal = 99;
        } else {
            televisao.canal--;
        }
    }

    public void changeVolume(Televisao televisao, String op) {
        if (Objects.equals(op, "+")) {
            televisao.volume++;
        } else {
            televisao.volume--;
        }
    }

    public void imprimirTv(Televisao televisao) {
        System.out.println("-------------- TELEVISAO --------------------");
        System.out.println("CANAL " + televisao.canal);
        System.out.println("VOLUME: " + televisao.volume);

        if (televisao.isSileced) {
            System.out.println("TELEVISAO SEM SOM");
        } else {
            System.out.println("TELEVISAO COM SOM");
        }
        if (televisao.isPowerOn) {
            System.out.println("TELEVISAO LIGADA");
        } else {
            System.out.println("TELEVISAO DESLIGADA");
        }
        System.out.println("----------------------------------------------");
    }

    public void menuCanal(Televisao televisao, Scanner keyboardint) {

        System.out.println("[1] MUDAR CANAL PARA O PRÓXIMO\t[2] MUDAR CANAL PARA O ANTERIOR\t[3] MUDAR O CANAL PARA ESPECIFICO\t[4] NÃO MUDAR CANAL");
        int opCanal = keyboardint.nextInt();
        if (opCanal != 4) {
            int canalAnt = televisao.canal;
            switch (opCanal) {
                case 1 -> changeCanalProx(televisao);
                case 2 -> changeCanalAnt(televisao);
                case 3 -> {
                    System.out.println("[DIGITE] CANAL ESPECIFICO");
                    int canalEsp = keyboardint.nextInt();
                    changeCanalEsp(televisao, canalEsp);
                }
            }
            System.out.println("CANAL ANTES DE MUDAR: " + canalAnt);
        }
        System.out.println("CANAL ATUAL: " + televisao.canal);
        System.out.println("APERTE QUALQUER VALOR MENOR QUE 0 PARA SAIR DO MENU DE CANAIS");
    }
}