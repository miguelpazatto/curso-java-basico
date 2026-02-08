package com.loiane.cursojava.exercicios.AulaQuinze;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor do saque: ");
        int valorSaque = scan.nextInt();
        int resto = 0;

        System.out.println("Notas de cem: " + (valorSaque / 100));
        resto = valorSaque % 100;

        System.out.println("Notas de cinquenta: " + (resto / 50));
        resto = valorSaque % 50;

        System.out.println("Notas de dez: " + (resto / 10));
        resto = valorSaque % 10;

        System.out.println("Notas de cinco: " + (resto / 5));
        resto = valorSaque % 5;

        System.out.println("Notas de cinquenta: " + (resto / 1));

    }

}
    

