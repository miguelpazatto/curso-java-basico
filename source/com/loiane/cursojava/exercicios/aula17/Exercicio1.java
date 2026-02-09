package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10: ");
        double nota = scan.nextDouble(); 

        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido! Digite sua nota novamente");
            nota = scan.nextDouble();
        }

        System.out.println("Você digitou " + nota);

    }

}


