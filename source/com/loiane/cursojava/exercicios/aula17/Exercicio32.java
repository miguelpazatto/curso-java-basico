package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String passos = "";

        System.out.println("Entre com o fatorial a ser calculado: ");
        int fatorial = scan.nextInt();

        int resultado = 1;

        for (int i = fatorial; i >= 1; i--) {
            resultado = resultado * i;
            
            passos += i; // String não "soma", ela coloca um do lado do outro

            if (i > 1) {
                passos += " x ";
            }
        }

        System.out.println("Fatorial de: " + fatorial);
        System.out.println(fatorial + "! = " + passos + " = " + resultado);

    }

}
