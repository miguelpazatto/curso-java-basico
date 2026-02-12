package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número de pessoas: ");
        int pessoas = scan.nextInt();

        double idade = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Entre com uma idade por vez: ");
            idade += scan.nextDouble();
        }

        double media = idade / pessoas;

        if (media >= 0 && media <= 25) {
            System.out.println("A média das idades é: " + media + ". Logo, a turma é jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("A média das idades é: " + media + ". Logo, a turma é adulta");
        } else {
            System.out.println("A média das idades é: " + media + ". Logo, a turma é idosa");
        }

    }

}
