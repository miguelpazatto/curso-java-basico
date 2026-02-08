package com.loiane.cursojava.exercicios.AulaQuinze;

import java.util.Scanner;

public class Fruteira {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos Kg de Morango você deseja comprar?");
        double kgMorango = scan.nextDouble();

        System.out.println("Quantos Kg de maça você deseja comprar?");
        double kgMaca = scan.nextDouble();

        double precoMorango = 0;
        double precoMaca = 0;

        if (kgMorango <= 5) {
            precoMorango = 2.5 * kgMorango;
        } else {
            precoMorango = 2.2 * kgMorango;
        }

        if (kgMaca <= 5) {
            precoMaca = 1.8 * kgMaca;
        } else {
            precoMaca = 1.5 * kgMaca;
        }

        double resultado = precoMorango + precoMaca;

        if (kgMorango + kgMaca <= 8 || resultado <= 25) {
            System.out.println("Valor a ser pago: " + resultado);
        } else {
            resultado = resultado * 0.9;
            System.out.println("Valor a ser pago: " + resultado);
        }

    }
}
