package com.loiane.cursojava.exercicios.AulaQuinze;

import java.util.Scanner;

public class Doze {

    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);

            System.out.println("Quanto você ganha por hora trabalhada?");
            double ganhoHora = scan.nextDouble();
            System.out.println("Quantas horas por mês você trabalha?");
            double horasMes = scan.nextDouble();

            double salarioBruto = ganhoHora * horasMes;

            int ir = 0;

            double impostoRenda = salarioBruto * ir / 100;
            double inss = salarioBruto * 3 / 100;
            double fgts = salarioBruto * 11 / 100;
            double totalDescontado = impostoRenda + inss;
            double salarioLiq = salarioBruto - totalDescontado;


            if (salarioBruto <= 900) {
                ir = 0;
                impostoRenda = salarioBruto * ir / 100;
                totalDescontado = impostoRenda + inss;
                salarioLiq = salarioBruto - totalDescontado;
                System.out.println("Salário Bruto: (" + ganhoHora + " * " + horasMes + ") : " + salarioBruto);
                System.out.println("(-) Imposto de renda (" + ir + "%) : " + impostoRenda);
                System.out.println("(-) INSS (3%) : " + inss);
                System.out.println("(-) FGTS (11%) : " + fgts);
                System.out.println("Total de descontos: " + totalDescontado);
                System.out.println("Salário Líquido: " + salarioLiq);
            } else if (salarioBruto > 900 && salarioBruto <= 1500) {
                ir = 5;
                impostoRenda = salarioBruto * ir / 100;
                totalDescontado = impostoRenda + inss;
                salarioLiq = salarioBruto - totalDescontado;
                System.out.println("Salário Bruto: (" + ganhoHora + " * " + horasMes + ") : " + salarioBruto);
                System.out.println("(-) Imposto de renda (" + ir + "%) : " + impostoRenda);
                System.out.println("(-) INSS (3%) : " + inss);
                System.out.println("(-) FGTS (11%) : " + fgts);
                System.out.println("Total de descontos: " + totalDescontado);
                System.out.println("Salário Líquido: " + salarioLiq);
            } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
                ir = 10;
                impostoRenda = salarioBruto * ir / 100;
                totalDescontado = impostoRenda + inss;
                salarioLiq = salarioBruto - totalDescontado;
                System.out.println("Salário Bruto: (" + ganhoHora + " * " + horasMes + ") : " + salarioBruto);
                System.out.println("(-) Imposto de renda (" + ir + "%) : " + impostoRenda);
                System.out.println("(-) INSS (3%) : " + inss);
                System.out.println("(-) FGTS (11%) : " + fgts);
                System.out.println("Total de descontos: " + totalDescontado);
                System.out.println("Salário Líquido: " + salarioLiq);
            } else {
                ir = 20;
                impostoRenda = salarioBruto * ir / 100;
                totalDescontado = impostoRenda + inss;
                salarioLiq = salarioBruto - totalDescontado;
                System.out.println("Salário Bruto: (" + ganhoHora + " * " + horasMes + ") : " + salarioBruto);
                System.out.println("(-) Imposto de renda (" + ir + "%) : " + impostoRenda);
                System.out.println("(-) INSS (3%) : " + inss);
                System.out.println("(-) FGTS (11%) : " + fgts);
                System.out.println("Total de descontos: " + totalDescontado);
                System.out.println("Salário Líquido: " + salarioLiq);
    
    }

}

}
