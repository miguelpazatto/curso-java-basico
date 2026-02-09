package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a população de A: ");
        double populacaoA = scan.nextDouble();

        System.out.println("Entre com a taxa de crescimento de A ");
        double taxaCrescimentoA = scan.nextDouble();

        System.out.println("Entre com a população de B: ");
        double populacaoB = scan.nextDouble();

        System.out.println("Entre com a taxa de crescimento de B ");
        double taxaCrescimentoB = scan.nextDouble();

        int i = 0;

       while (populacaoA < populacaoB) {
        populacaoA += (populacaoA * taxaCrescimentoA) / 100;
        populacaoB += (populacaoB * taxaCrescimentoB) / 100;
        

        i++;

       }

       System.out.println("Cidade A chegou em cidade B");
       System.out.println("Quantidade de anos: " + i);

    }

}
