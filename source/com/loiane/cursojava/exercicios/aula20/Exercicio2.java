package com.loiane.cursojava.exercicios.aula20;

import java.util.Random;

public class Exercicio2 {

    public static void main(String[] args) {
        
        int[][] numerosAleatorios = new int[10][10];

        Random numerosRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numerosRandom.nextInt(9);
            }
        }

        int maior5 = Integer.MIN_VALUE;
        int menor5 = Integer.MAX_VALUE;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {

                if (numerosAleatorios[4][j] > maior5) {
                    maior5 = numerosAleatorios[4][j];
                } 
                
                if (numerosAleatorios[4][j] < menor5) {
                    menor5 = numerosAleatorios[4][j];
                }
            }
        }

        /*
        for (int i = 0; i < numerosAleatorios[5].length; i++) {
            if (numerosAleatorios[5][i] > maior5) {
                    maior5 = numerosAleatorios[5][i];
                } 
                
                if (numerosAleatorios[5][i] < menor5) {
                    menor5 = numerosAleatorios[5][i];
                }
        }

        Lógica usada na correção do curso.
        */


        int maior7 = Integer.MIN_VALUE;
        int menor7 = Integer.MAX_VALUE;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {

                if (numerosAleatorios[i][6] > maior7) {
                    maior7 = numerosAleatorios[i][6];
                } 

                if (numerosAleatorios[i][6] < menor7) {
                    menor7 = numerosAleatorios[i][6];
                }
            }
        }


        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior da linha 5 = " + maior5);
        System.out.println("Menor da linha 5 = " + menor5);
        System.out.println("Maior da linha 7 = " + maior7);
        System.out.println("Menor da linha 7 = " + menor7);


    }

}

