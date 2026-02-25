package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Aula13 {

    public static void main(String[] args) {
        
        // System.out.println("Alo mundo");

        Scanner scan = new Scanner(System.in);

        /* double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        double numero4 = 0;
        double resultado = 0;
        
        System.out.println("Digite suas notas: ");
        numero1 = scan.nextDouble();
        numero2 = scan.nextDouble();
        numero3 = scan.nextDouble();
        numero4 = scan.nextDouble();
        resultado = (numero1 + numero2 + numero3 + numero4) / 4;
        System.out.println("A sua média é: " + resultado); */


        /* int metros = 0;
        int cent = 0;
        
        System.out.println("Digite quantos metros você quer converter: ");
        metros = scan.nextInt();

        cent = metros * 100;

        System.out.println(metros + " metros é igual a " + cent + " centímetros"); */


        /* double numero1 = 0;
        double numero2 = 0;
        double real = 0;

        System.out.println("Digite um dois números inteiros e um número real, respectivamente: ");
        numero1 = scan.nextDouble();
        numero2 = scan.nextDouble();
        real = scan.nextDouble();

        double a, b, c;

        a = (2 * numero1) + (numero2 / 2);
        b = (3 * numero1) + real;
        c = real * real * real;

        System.out.print(a + "\n" + b + "\n" + c + "\n"); */


        /* double rendaHora = 0;
        double horasMes = 0;
        double salarioMensal = 0;
        double INSS, sindicato, impostoDeRenda, salarioLiq;

        System.out.println("Digite quanto você ganha por hora e quantas horas você trabalha por mês: ");
        rendaHora = scan.nextDouble();
        horasMes = scan.nextDouble();

        salarioMensal= rendaHora * horasMes;

        System.out.println("Seu salário mensal bruto é " + salarioMensal);

        INSS = (salarioMensal * 0.08);
        System.out.println("Foi destinado ao INSS um total de " + INSS);

        sindicato = (salarioMensal * 0.05);
        System.out.println("Foi destinado ao Sindicato um total de " + sindicato);

        salarioLiq = salarioMensal - (salarioMensal * 0.11) - (INSS) - (sindicato);
        System.out.println("Seu salário mensal líquido é " + salarioLiq); */

        System.out.println("Entre com o tamanho do arquivo");
        double tamArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de download é " + tempo);








    }

}
