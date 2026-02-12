package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de temperaturas a serem analisadas: ");
        int quantTemp = scan.nextInt();

        int resultado = 0;
        int menor = 500;
        int maior = -500;
        
        for (int i = 0; i < quantTemp; i++) {
            System.out.println("Entre com uma temperatura de cada vez: ");
            int valorTemp = scan.nextInt();

            if (valorTemp < menor) {
                menor = valorTemp;
            } 
            
            if (valorTemp > maior) {
                maior = valorTemp;
            }

            resultado += valorTemp;
        }

        System.out.println("O menor valor de temperatura é: " + menor + " e o maior valor é: " + maior);
        double media = resultado / quantTemp;
        System.out.println("A média das temperatura é: " + media);
        

    }

}
