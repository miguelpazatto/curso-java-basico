package com.loiane.cursojava.exercicios.Aula19;

import java.util.Scanner;


public class Exercicio24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        boolean palindromo = true;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + (i + 1) + ":");
            vetorA[i] = scan.nextInt();
        }

        int indexInicio = 0;
        int indexFinal = 9;

        for (int i = 0; i < (vetorA.length / 2); i++) {
            if (vetorA[indexInicio] == vetorA[indexFinal]) {
                indexInicio = indexInicio + 1;
                indexFinal = indexFinal - 1;
            } else {
                palindromo = false;
                System.out.println("Não é um palíndromo");
                System.out.println("O valor " + vetorA[indexInicio] + " na posição " + indexInicio + " é diferente do " + vetorA[indexFinal] + " na posição " + indexFinal);
                break;
            }
        }

        if (palindromo == true) {
            System.out.println("Vetor A é um palíndromo");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.print(vetorA[i] + " ");
            }
        }

    }

}
