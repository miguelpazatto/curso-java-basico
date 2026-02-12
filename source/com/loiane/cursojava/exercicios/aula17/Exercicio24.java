package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de notas: ");
        int quantidade = scan.nextInt();
        double notas = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Entre com uma nota:");
            notas += scan.nextDouble();
        }

        double media = notas / quantidade;
        System.out.println("A sua média é: " + media);

    }

}
