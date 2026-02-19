package com.loiane.cursojava.exercicios.Aula19;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] idade = new int[10];
        
        for (int i = 0; i < idade.length; i++) {
            System.out.println("Entre com as idades, uma por vez: ");
            idade[i] = scan.nextInt();
        }

        int menor = idade[0];
        int indexMenor = 0;
        int maior = idade[0];
        int indexMaior = 0;
        for (int i = 1; i < idade.length; i++) {

            if (idade[i] > maior) {
                maior = idade[i];
                indexMaior = i;
            } else if (idade[i] < menor) {
                menor = idade[i];
                indexMenor = i;
            } 
        }

        System.out.print("Vetor de idades = ");
        for (int i = 0; i < idade.length; i++) {
        System.out.print(idade[i] + " ");
        }
        System.out.println();

        System.out.println("Menor idade: " + menor);
        System.out.println("Índice menor idade: " + indexMenor);
        System.out.println("Maior idade: " + maior);
        System.out.println("Índice maior idade: " + indexMaior);

    }

}
