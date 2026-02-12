package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class exercicio31 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos produtos você está levando?");
        int quantProdutos = scan.nextInt();

        double resultado = 0;

        System.out.println("Qual o valor de cada produto? (Entre com um de cada vez)");

        for (int i = 1; i <= quantProdutos; i++) {
        double precoProduto = scan.nextDouble();

        if (precoProduto != 0) {
            System.out.println("Produto " + i + "  R$" + precoProduto + ",00");
            resultado += precoProduto;
        } else {
            System.out.println("Compra finalizada!");
        }

        }

        System.out.println("Total: R$" + resultado + ",00");

        System.out.println("Qual valor fornecido em dinheiro pelo cliente?");
        double dinheiro = scan.nextDouble();

        System.out.println("Dinheiro: R$" + dinheiro + ",00");
        System.out.println("Troco: R$" + (dinheiro - resultado) + ",00");
    }

}
