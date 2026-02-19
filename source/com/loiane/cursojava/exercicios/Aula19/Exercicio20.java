package com.loiane.cursojava.exercicios.Aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Entre com a cotação do dólar: ");
        cotacao = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i+1);
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(df.format(vetorA[i]) + " ");
        }
        System.out.println();



    }

}
