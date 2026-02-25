package com.loiane.cursojava.exercicios.aula25a27;

public class Aluno {

    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];; 
    double[][] notasDisiciplinas = new double[3][4];


    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < notasDisiciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisiciplinas[i].length; j++) {
                System.out.println(notasDisiciplinas[i][j] + " ");
            }
        }
        System.out.println();
    }

    boolean verificarAprovado(int indice) {

        double soma = 0;

        for (int i = 0; i < notasDisiciplinas[indice].length; i++) {
            soma += notasDisiciplinas[indice][i];
        }

        double media = soma / 4;

        if (media >= 7) {
            return true;
        } 

        return false;

    }   

}
