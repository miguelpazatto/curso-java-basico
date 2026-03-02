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

        System.out.println(s1.equals(s2)); //método equals pois String não é primitivo, logo "==" iria apontar pra refrência na memória não para o conteúdo
                                            // melhor maneira de comparar objetos (lembrando que toda classe estende classe Object
                                            // da pra setar o equals pra comparar apenas os atributos e/ou métodos requisitados, e não todos que é o padrão


    }

}
