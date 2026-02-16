package com.loiane.cursojava.exercicios.Aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[15];
        double[] B = new double[A.length];

        for (int i = 0; i < A.length; i++) {
            
            System.out.println("Entre com o valor que vai preencher o índice " + i + " do vetor:");
            A[i] = scan.nextInt();

            B[i] = Math.sqrt(A[i]); // B tem que ser double por causa do retorno da biblioteca Math
        }

        System.out.print("Vetor A = ");
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("Vetor B = ");
        for(int i = 0; i < B.length; i++) {
            System.out.print(df.format(B[i]) + " ");
        }
        System.out.println();

    }

}
