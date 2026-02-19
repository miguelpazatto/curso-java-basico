package com.loiane.cursojava.exercicios.Aula19;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] idade = new int[10];
        int cont = 0;

        for (int i = 0; i < idade.length; i++) {
            System.out.println("Entre com as idades, uma por vez: ");
            idade[i] = scan.nextInt();

            if (idade[i] > 35) {
                cont++;
            }
        }

        for (int i = 0; i < idade.length; i++) {
        System.out.print(idade[i] + " ");
        }
        System.out.println("A quantidade de pessoas com mais de 35 anos é " + cont);

    }

}
