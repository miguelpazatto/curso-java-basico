package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos pães você está levando?");
        int quantProdutos = scan.nextInt();

        System.out.println("Qual o valor unitário do pão?");
        double precoPao = scan.nextDouble();

        for (int i = 1; i <= quantProdutos; i++) {
            double preco = i * precoPao;
            System.out.println(i + "-   R$" + preco + ",00");
        }

    }    

}
