package com.loiane.cursojava.exercicios.aula36;

import java.util.Scanner;

public class Exer02 {

        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);

            System.out.println("Entre com o nome do curso: ");
            String nome = scan.nextLine();

            System.out.println("Entre com o horário do curso: ");
            String horarioCurso = scan.nextLine();

            System.out.println("Entre com o nome do professor do curso: ");
            String nomeProf = scan.nextLine();
            
            System.out.println("Entre com o email do professor do curso: ");
            String emailProf = scan.nextLine();

            System.out.println("Entre com o departamento do professor do curso: ");
            String departamento = scan.nextLine();

            Curso curso = new Curso();
            curso.setNome(nome);
            curso.setHorario(horarioCurso);

            Professor professor = new Professor();
            professor.setnome(nomeProf);
            professor.setDepartamento(departamento);
            professor.setEmail(emailProf);

            curso.setProfessor(professor);

            Aluno[] alunos = new Aluno[5];
            for (int i = 0; i < 5; i++) {     

                System.out.println("Entre com o nome do aluno " + (i+1));
                String nomeAluno = scan.nextLine();

                System.out.println("Entre com a matricula do aluno " + (i+1));
                String matricula = scan.nextLine();

                double[] notas = new double[4];

                for (int j = 0; j < 4; j++) {
                    System.out.println("Entre com a nota " + (j+1));
                    notas[j] = scan.nextDouble();
                }

                Aluno aluno = new Aluno();
                aluno.setNomeAluno(nomeAluno);
                aluno.setMatricula(matricula);
                aluno.setNotas(notas);

                alunos[i] = aluno;
        }

        curso.setAlunos(alunos); 

        System.out.println(curso.obterInfo());

    }

}
