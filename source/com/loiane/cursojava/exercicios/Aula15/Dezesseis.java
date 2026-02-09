package com.loiane.cursojava.exercicios.Aula15;

import java.util.Scanner;

public class Dezesseis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("A fórmula da equação de 2° grau é: ax² + bx + c");
        System.out.println("Informe o valor de a, b e c respectivamente");
        double a = scan.nextDouble();
        
        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau");
        } else {
            double b = scan.nextDouble();
            double c = scan.nextDouble();

            double delta = (b * b) - 4 * a * c;

            double raiz1 = (-1 * b + (Math.sqrt(delta))) / (2 * a);
            double raiz2 = (-1 * b - (Math.sqrt(delta))) / (2 * a);

            if (delta < 0) {
                System.out.println("A equação não tem raízes");
            } else if (delta == 0) {
                System.out.println("A raíz da equação é: " + raiz1);
            } else {
                System.out.println("As raízes das equações são: " + raiz1 + " e " + raiz2);
            }

        }

    }
}
