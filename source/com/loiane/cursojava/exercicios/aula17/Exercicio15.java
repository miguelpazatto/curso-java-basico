package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int anterior = 0;
        int atual = 1;
        int proximo;

        /* Exercicio 15
        System.out.println("Digite até onde você desejava calcular sua séria de Fibonacci: ");
        int fibonacci = scan.nextInt();
        */


        // Exercicio 16
        do {
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;


            System.out.println(anterior);
        } while (anterior <= 500);
        

    }

}


