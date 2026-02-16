package com.loiane.cursojava.exercicios.Aula19;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int cont = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Escreva o número da posição " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0) {
                soma += vetorA[i];
                cont++;
            }
        }

        double media = soma / cont;

        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Media dos valores ímpares do vetor: " + media);


    }

}
