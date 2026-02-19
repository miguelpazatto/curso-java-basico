package com.loiane.cursojava.exercicios.Aula19;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {

            System.out.println("Digite a primeira nota do aluno " + (i+1) + ":");
            notas1[i] = scan.nextDouble();

            System.out.println("Digite a segunda nota do aluno " + (i+1) + ":");
            notas2[i] = scan.nextDouble();
        }

        for (int i = 0; i < notas1.length; i++) {
            double result = (notas1[i] + notas2[i]) / 2;

            System.out.println("Nota final: " + result);
            if (result >= 7) {
                System.out.println("O aluno " + (i+1) + " está APROVADO");
            } else {
                System.out.println("O aluno " + (i+1) + " está REPROVADO");
            }
        }

    }

}
