package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int numero = scan.nextInt();

        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("É divisível por: " + i);
                primo = false;   
            }   
        }

        if (primo == false) {
        System.out.println("Não é primo");
        } else {
        System.out.println("É um número primo");
        }

    }

}
