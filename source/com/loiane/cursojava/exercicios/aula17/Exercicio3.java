package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;

        do {

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite seu salaŕio: ");
        double salario = scan.nextDouble();

        System.out.println("Digite seu sexo: \"f\" para feminino ou \"m\" para masculino");
        String sexo = scan.next();

        System.out.println("Digite seu estado civil: \"s\" para solteiro ou \"c\" para casado ou \"v\" para viúvo ou \"d\" para divorciado:");
        String estadoCivil = scan.next();

        if ((nome.length() > 3) && (idade >= 0 && idade <=150) && (salario > 0) && (sexo.equals("f") || sexo.equals("m")) && (estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d"))) {
            infoValidas = true;
            System.out.println("Informações válidas");
        } else {
            System.out.println("Informações inválidas! Digite novamente: ");
        } 
        
    } while (infoValidas == false);

}

}
