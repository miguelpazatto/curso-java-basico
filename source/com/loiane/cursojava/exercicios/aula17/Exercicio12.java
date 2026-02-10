package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número da tabuada desejada: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;

            System.out.println(numero + " X " + i + " = " + resultado);
        }

    }

}
