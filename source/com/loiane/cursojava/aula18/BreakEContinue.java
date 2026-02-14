package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    /* System.out.println("Entre com um número: ");
    int num = scan.nextInt();

    System.out.println("Entre com um limite: ");
    int maximo = scan.nextInt();

    for (int i = num; i <= maximo; i++) {

        if (i % 7 == 0) {
            System.out.println("O valor de i é " + i);
            break;
        }
    }*/ 


    /* for (int i = 0; i <= 4; i++) {
        rotulo1: {
            rotulo2: {
                rotulo3: {
                    if (i == 1) {
                        break rotulo1;
                    }
                     if (i == 2) {
                        break rotulo2;
                    }
                     if (i == 3) {
                        break rotulo3;
                    }
                    System.out.println("Rótulo 3");
                }
                System.out.println("Rótulo 2");
            }
            System.out.println("Rótulo 1");
        }
        System.out.println(i);
    } */


    System.out.println("Entre com um número: ");
    int num = scan.nextInt();

    System.out.println("Entre com um limite: ");
    int maximo = scan.nextInt();

    for (int i = num; i <= maximo; i++) {

        if (i % 7 == 0) {
            continue; // vai pra próxima interação "pulando" o código
        }
        System.out.println("O valor de i é " + i);
    }

}

}
