package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite 5 números separados por spacebar: ");
        double numero1 = scan.nextInt();
        double numero2 = scan.nextInt();
        double numero3 = scan.nextInt();
        double numero4 = scan.nextInt();
        double numero5 = scan.nextInt();

        double soma = numero1 + numero2 + numero3 + numero4 + numero5;
        double media = (numero1 + numero2 + numero3 + numero4 + numero5) / 5;

        System.out.println("A soma dos números é: " + soma + " e a média é: " + media);
    }

}
