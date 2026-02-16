package com.loiane.cursojava.exercicios.Aula19;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int menor = 0;
        int igual = 0;
        int maior = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Escreva o número que vai ocupar a posição " + i + ":");
            A[i] = scan.nextInt();

            if (A[i] < 15) {
                menor++;
            } else if (A[i] == 15) {
                igual++;
            } else {
                maior++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        } 
        System.out.println();

        System.out.println("A quantidade de valores do vetor A menor que 15 é " + menor);
        System.out.println("A quantidade de valores do vetor A igual a 15 é " + igual);
        System.out.println("A quantidade de valores do vetor A maior que 15 é " + maior);


    }

}
