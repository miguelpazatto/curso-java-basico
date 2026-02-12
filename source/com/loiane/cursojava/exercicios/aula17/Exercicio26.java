package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o total de eleitores: ");
        int eleitores = scan.nextInt();

        int votos = 0;
        int votos1 = 0;
        int votos2= 0;
        int votos3 = 0;

        for (int i = 0; i < eleitores; i++) {
            System.out.println("Escolha seu voto digitando 1, 2 ou 3: ");
            votos = scan.nextInt();
       

            switch (votos) {
                case 1: 
                    votos1++;
                    break;
                case 2: 
                    votos2++;
                    break;
                case 3: 
                    votos3++;
                    break;
            
                default:
                    System.out.println("Candidato não existente!");
                    break;
            }
        }

        System.out.println("O candidato 1 tem: " + votos1 + " votos");
        System.out.println("O candidato 2 tem: " + votos2 + " votos");
        System.out.println("O candidato 3 tem: " + votos3 + " votos");

    }

}
