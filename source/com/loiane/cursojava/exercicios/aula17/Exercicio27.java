package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a quantidade de turmas da escola?");
        double quantTurmas = scan.nextDouble();

        double quantAlunos = 0;
        double resultado = 0;

        boolean menorQuarenta = true;

        for (int i = 0; i < quantTurmas; i ++) {
            System.out.println("Entre com a quantidade de aluno da turma, uma de cada vez: ");
            quantAlunos = scan.nextDouble();

            if (quantAlunos > 40) {
                System.out.println("As turmas não podem ter mais que 40 alunos");
                menorQuarenta = false;
                break;
            } else {
                menorQuarenta = true;
                resultado += quantAlunos;
            }
        }

        double media = resultado / quantTurmas;
        System.out.println("A média de alunos por turma é: " + media);

    }

}
