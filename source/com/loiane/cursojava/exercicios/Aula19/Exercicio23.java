package com.loiane.cursojava.exercicios.Aula19;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        boolean par = true;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + (i + 1) + ":");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                par = true;
            } else {
                par = false;
                System.out.print("Valor ímpar detectado");
                break;
            }
        }

    }
    
}
