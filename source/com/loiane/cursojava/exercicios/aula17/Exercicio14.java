package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int numero = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                numero = 1;
                par += numero;
            } else {
                numero = 1;
                impar += numero;
            }

        }

        System.out.println("A quantidade de números PARES é: " + par);
        System.out.println("A quantidade de números ÍMPARES é: " + impar);

    }

}
