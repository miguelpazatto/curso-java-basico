package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de CDs: ");
        int quantCD = scan.nextInt();

        double valorCD = 0;

        for (int i = 0; i < quantCD; i++) {
            System.out.println("Entre com o valor dos CDs um por vez: ");
            valorCD += scan.nextDouble();
        }

        double media = valorCD / quantCD;
        System.out.println("O valor médio gasto em cada CD é: " + media);
    }

}
