package com.loiane.cursojava.exercicios.aula25a27;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.nomeCurso = scan.next();

        System.out.println("Entre com a matrícula");
        aluno.matricula = scan.next();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina " + (i+1));
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisiciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisiciplinas[i].length; j++) {
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisiciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina: " + aluno.nomeDisciplinas[i] + " - foi aprovado!");
            } else {
                System.out.println("Disciplina: " + aluno.nomeDisciplinas[i] + " - foi reprovado");
            }
        }

    }

}
