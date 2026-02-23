package com.loiane.cursojava.exercicios.aula24;

import java.util.Date;

public class Exercicio4 {

    public static void main(String[] args) {
        
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Loiane";

        System.out.println("Nome do livro: " + livro.nome);

    }

}
