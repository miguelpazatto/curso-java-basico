package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int resultado = 1;

        System.out.println("Entre com o fatorial a ser calculado: ");
        int fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1; i--) {
            resultado = resultado * i;
        }

        System.out.println("Resultado é: " + resultado);

       
    }

}
