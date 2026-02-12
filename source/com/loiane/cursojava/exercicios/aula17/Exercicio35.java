package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número máximo a ser analisado: ");
        double numeroMax = scan.nextDouble();

        boolean primo = true;

        for (int j = 1; j <= numeroMax; j++) {
            if (j <= 1) {
                primo = false;
            } else {
                primo = true; 
            }

            for (int i = 2; i < j; i++) {

                if (j % i == 0) {
                    primo = false;
                    break;
                }

            }

            if (primo == true) {
            System.out.println("O número " + j + " é primo");
            } else {
            System.out.println("O número " + j + " NÃO é primo");
            }

        }

    }

}


