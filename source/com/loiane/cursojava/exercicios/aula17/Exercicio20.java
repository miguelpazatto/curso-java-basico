package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int resultado = 1;
        boolean numeroValido = false;

        System.out.println("Entre com o fatorial a ser calculado: ");
        int fatorial = scan.nextInt();

        do {
        if (fatorial >= 0 && fatorial < 16) {
            numeroValido = true;
        for (int i = fatorial; i >= 1; i--) {
            resultado = resultado * i;

            
        }

        System.out.println("O fatorial de " + fatorial + " é: " + resultado);

        } else {
            System.out.println("Valor inválido, digite um número positivo e menor que 16");
            fatorial = scan.nextInt();
        }
    } while (numeroValido == false)
;  
    }

}



