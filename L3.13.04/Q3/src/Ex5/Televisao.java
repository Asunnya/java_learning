package Ex5;

import java.util.Objects;
import java.util.Scanner;

public class Televisao {
    private boolean isPowerOn = false;
    private int volume = 5;
    private int canal = 0;
    private boolean isSileced = false;

    public void ligarTV() {
        if (this.isPowerOn) {
            this.isPowerOn = false;
        } else {
            this.isPowerOn = true;
        }
    }

    public void muteTV() {
        if (this.isSileced) {
            this.isSileced = false;
        } else {
            this.isSileced = true;
        }
    }

    public void changeCanalEsp(int canalDesejado) {
        this.canal = canalDesejado;
    }

    public void changeCanalProx() {
        if (this.canal == 99) {
            this.canal = 0;
        } else {
            this.canal++;
        }
    }

    public void changeCanalAnt() {
        if (this.canal == 0) {
            this.canal = 99;
        } else {
            this.canal--;
        }
    }

    public boolean changeVolume(String op) {
        if (Objects.equals(op, "+")) {
            if (this.volume != 10) {
                this.volume++;
            }
        } else {
            if (this.volume != 0) {
                this.volume--;
            }
        }
        return true;
    }

    public int getVolume() {
        return this.volume;
    }

    public void imprimirTv() {
        System.out.println("-------------- TELEVISAO --------------------");
        System.out.println("CANAL " + this.canal);
        System.out.println("VOLUME: " + this.volume);

        if (this.isSileced) {
            System.out.println("TELEVISAO SEM SOM");
        } else {
            System.out.println("TELEVISAO COM SOM");
        }
        if (this.isPowerOn) {
            System.out.println("TELEVISAO LIGADA");
        } else {
            System.out.println("TELEVISAO DESLIGADA");
        }
        System.out.println("----------------------------------------------");
    }

    public void menuCanal(Scanner keyboardint) {

        System.out.println("[1] MUDAR CANAL PARA O PRÓXIMO\t[2] MUDAR CANAL PARA O ANTERIOR\t[3] MUDAR O CANAL PARA ESPECIFICO\t[4] NÃO MUDAR CANAL");
        int opCanal = keyboardint.nextInt();
        if (opCanal != 4) {
            int canalAnt = this.canal;
            switch (opCanal) {
                case 1 -> changeCanalProx();
                case 2 -> changeCanalAnt();
                case 3 -> {
                    System.out.println("[DIGITE] CANAL ESPECIFICO");
                    int canalEsp = keyboardint.nextInt();
                    changeCanalEsp(canalEsp);
                }
            }
            System.out.println("CANAL ANTES DE MUDAR: " + canalAnt);
        }
        System.out.println("CANAL ATUAL: " + this.canal);
        System.out.println("APERTE QUALQUER VALOR MENOR QUE 0 PARA SAIR DO MENU DE CANAIS");
    }
}