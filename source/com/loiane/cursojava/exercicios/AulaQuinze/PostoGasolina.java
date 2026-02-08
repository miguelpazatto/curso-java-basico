package com.loiane.cursojava.exercicios.AulaQuinze;

import java.util.Scanner;

public class PostoGasolina {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos litros foram vendidos?");
        double litros = scan.nextDouble();

        System.out.println("Para álcool digite A / Para gasolina digite G");
        String tipoCombustivel = scan.next();

        double valorPago = 0;

        switch (tipoCombustivel) {
            case "A":
                if(litros <= 20){
                    valorPago = (litros * 1.9) * 0.97;
                    System.out.println("O valor a ser pago é: " + valorPago);
                } else {
                    valorPago = (litros * 1.9) * 0.95;
                    System.out.println("O valor a ser pago é: " + valorPago);
                }
                break;
        
            case "G": 
                if(litros <= 20){
                    valorPago = (litros * 2.5) * 0.96;
                    System.out.println("O valor a ser pago é: " + valorPago);
                } else {
                    valorPago = (litros * 2.5) * 0.94;
                    System.out.println("O valor a ser pago é: " + valorPago);
                }
            
            default:
                System.out.println("Você digitou um tipo de combustível não existente no sistema");
                break;
        }


    }

}
