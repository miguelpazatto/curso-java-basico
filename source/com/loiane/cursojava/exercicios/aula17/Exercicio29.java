package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos produtos você está levando?");
        int quantProdutos = scan.nextInt();

        for (int i = 1; i <= quantProdutos; i++) {
            double preco = i * 1.99;
            System.out.println(i + "-   R$" + preco + ",00");
        }

    }

}
