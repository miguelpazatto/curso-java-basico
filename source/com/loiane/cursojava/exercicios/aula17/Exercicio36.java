package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a tabuada que você deseja calcular: ");
        int tabuada = scan.nextInt();

        System.out.println("Entre com o valor de início da tabuada: ");
        int comecoTabuada = scan.nextInt();

        System.out.println("Entre com o valor final da tabuada: ");
        int finalTabuada = scan.nextInt();

        System.out.println("Montar a tabuda de: " + tabuada);
        System.out.println("Começar por: " + comecoTabuada);
        System.out.println("Terminar em: " + finalTabuada);
        System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + comecoTabuada + " e terminando em " + finalTabuada + ":");

        for (int i = comecoTabuada; i <= finalTabuada; i++) {

            int resultado = tabuada * i;

            System.out.println(tabuada + " x " + i + " = " + resultado);

        }



    }

}
