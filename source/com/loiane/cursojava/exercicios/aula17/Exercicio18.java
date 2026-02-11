package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;
import java.util.Random;

public class Exercicio18 {

    public static void main(String[] args) {

        int maior = 0;
        int menor = 1001;
        
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Entre com quantos números você quer gerar: ");
        int quantidade = scan.nextInt();

        for (int i = 0; i < quantidade; i++) {
            int numeroSorteado = gerador.nextInt(1001);
            
            if (numeroSorteado < menor) {
                menor = numeroSorteado;
            }
            if (numeroSorteado > maior) {
                maior = numeroSorteado;
            }
            
        }

        System.out.println("O maior número é: " + maior + " e o menor é: " + menor + ". A soma de ambos resulta em: " + (menor + maior));
        

    }

}
