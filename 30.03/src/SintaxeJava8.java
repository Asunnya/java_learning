/*
Um quadrado mágico é uma matriz quadrada, de valores inteiros, na qual a soma dos elementos de cada linha,
a soma dos elementos de cada coluna e a soma dos elementos da diagonal primária e da diagonal secundária são iguais.
Desenvolva um programa que leia do usuário uma matriz quadrada de ordem n e imprima se a matriz é um quadrado mágico ou não.
 */
/**/

import java.util.Scanner;

/**
 * @author Isadora Ribeiro
 */

public class SintaxeJava8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("[DIGITE] ORDEM DA MATRIZ");
        int n = keyboard.nextInt();
        boolean perfectSquare = true;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("[DIGITE] VALOR A SER INSERIDO");
                matrix[i][j] = keyboard.nextInt();
            }
        }
        //Somando os elementos da diagonal principal
        int sumDiagonalP = 0;
        for (int i = 0; i < n; i++) {
            sumDiagonalP = sumDiagonalP + matrix[i][i];
        }

        //Somando os elementos da diagonal secundária
        int sumDiagonalS = 0;
        for (int i = 0; i < n; i++) {
            sumDiagonalS = sumDiagonalS + matrix[i][n - i - 1];
        }

        if (sumDiagonalS == sumDiagonalP) {
            //Verifica se a soma da linhas são iguais
            int sumLines = 0;
            boolean everyLineHasSumEqual = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sumLines = sumLines + matrix[i][j];
                }
                if (sumLines != sumDiagonalS) {
                    everyLineHasSumEqual = false;
                }
                sumLines = 0;
            }
            //Verificar se a soma das colunas são iguais
            if (everyLineHasSumEqual) {
                int sumCol = 0;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        sumCol = sumCol + matrix[j][i];
                    }
                    if (sumCol != sumDiagonalS && sumCol != sumLines) {
                        perfectSquare = false;
                    }
                    sumCol = 0;
                }

            }
        }

        if (perfectSquare) {
            System.out.println("Essa matriz eh um quadrado perfeito!");
        } else {
            System.out.println("Essa matriz não eh um quadrado perfeito!");
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
