package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o intervalo: ");
        int intervalo = scan.nextInt();

        boolean primo = true;
        int cont = 0;
        int j = 2;

            for (int i = 1; i <= intervalo; i++) {
                primo = true;
                for (j = 2; j < i; j++) {
                    cont++;
                    if (i % j == 0) {
                        primo = false;   
                        break;
                    } 
                }
                    
                if (primo) {
                    System.out.println(i);
                }

            }

        System.out.println("Contador de divisões: " + cont);

    }
        
}






