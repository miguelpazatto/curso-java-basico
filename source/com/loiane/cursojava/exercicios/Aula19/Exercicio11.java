package com.loiane.cursojava.exercicios.Aula19;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int quantPar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor a ser preenchido no índice " + i + ":");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                quantPar++;
            }
        }

        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Quantidade de pares em A: " + quantPar);
        
        }

    }


