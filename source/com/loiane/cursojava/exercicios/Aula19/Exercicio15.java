package com.loiane.cursojava.exercicios.Aula19;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Escreva o número da posição " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0) {
                impar++;
            } 
        }

        int par = vetorA.length - impar;

        double porcentagemPar = (par * 100) / vetorA.length;
        double porcentagemImpar = 100 - porcentagemPar;

        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " "); 
        }
        System.out.println();
        System.out.println("Porcentagem dos números pares: " + porcentagemPar);
        System.out.println("Porcentagem dos números ímpares: " + porcentagemImpar);

    }

}
