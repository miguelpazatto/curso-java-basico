package com.loiane.cursojava.exercicios.Aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        double[] C = new double[A.length];

        for (int i = 0; i < A.length; i++) {

            System.out.println("Entre com o valor que vai preencher o índice " + i + " do vetor A:");
            A[i] = scan.nextInt();

        }

        for (int i = 0; i < B.length; i++) {

            System.out.println("Entre com o valor que vai preencher o índice " + i + " do vetor B:");
            B[i] = scan.nextInt();

            C[i] = (double) A[i] / B[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor C = ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(df.format(C[i]) + " ");
        }
        System.out.println();

    }

}
