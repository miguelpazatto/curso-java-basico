package com.loiane.cursojava.exercicios.aula20;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[][] matrizM = new int[3][3];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {

                System.out.println("Entre com o valor da posição (" + i + "," + j + "): ");
                matrizM[i][j] = scan.nextInt();

            }
        }

        int par = 0;
        int impar = 0;

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {

                if (matrizM[i][j] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }

            }
        }

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade de números pares = " + par);
        System.out.println("Quantidade de números ímpares = " + impar);

    }

}
