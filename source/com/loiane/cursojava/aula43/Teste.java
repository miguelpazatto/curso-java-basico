package com.loiane.cursojava.aula43;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno); //método toString para mostrar informações

        String s1 = "asadfsd";
        String s2 = "asadfsd";

        System.out.println(s1.equals(s2));
    }

}
