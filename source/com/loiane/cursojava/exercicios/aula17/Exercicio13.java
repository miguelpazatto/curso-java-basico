package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int resultado = 1;

        System.out.println("Entre com o número referente a base: ");
        int base = scan.nextInt();

        System.out.println("Entre com o número referente ao expoente: ");
        int expoente = scan.nextInt();

        for (int cont = 0; cont < expoente; cont++) {
            resultado = resultado * base;

        }

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é igual a: " + resultado);

    }

}
