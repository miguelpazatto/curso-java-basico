package com.loiane.cursojava.aula35;

public class MinhaCalculadora {

    public static int soma(int num1, int num2) { //static faz com que não seja necessário instânciar a classe
        return num1 + num2;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int soma(int[] vetorInteiros) {

        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }

        return total;
    }

    public static int fatorialNR(int num) { //recursividade - estrutura de dados usa muito

        if (num == 0) {
            return 1;
        }

        return num * fatorialNR(num - 1);

    }
}
