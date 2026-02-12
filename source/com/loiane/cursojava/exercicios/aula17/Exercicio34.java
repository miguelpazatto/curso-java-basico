package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        double numero = scan.nextDouble();

        boolean primo = true;

        for (int i = 2; i < numero; i++) {

            if (numero % i != 0) {
                primo = true;
            }

            if (numero % i == 0) {
                primo = false;
                break;
            }

        }

        if (primo == true) {
            System.out.println("O número " + numero + " é primo");
        } else {
            System.out.println("O número " + numero + " NÃO é primo");
        }

    }

}
