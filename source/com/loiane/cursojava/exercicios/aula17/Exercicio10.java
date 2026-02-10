package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int soma = 0;

        System.out.println("Digite o primeiro número inteiro: ");
        int inteiro1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int inteiro2 = scan.nextInt();

        for (inteiro1 = inteiro1; inteiro1 <= inteiro2; inteiro1++) {
            System.out.println(inteiro1);

            soma += inteiro1;
        }

        // Exercicio 11
        System.out.println("A soma de todos os números no intervalo escolhido é: " + soma);

    }

}
