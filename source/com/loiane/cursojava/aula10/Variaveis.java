package com.loiane.cursojava.aula10;

public class Variaveis {

    public static void main(String[] args) {

        int idade = 20;
        String nome = "Miguel"; // Strings requerem aspas duplas
        String nomeDoMeuCachorro = "Jade";

        // A linguagem permite mas não é utilizado ou não é cinveção Java
        int _idade;
        int $idade;
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 21; // Mudando valor da variável idade

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

        // Nomes de variáveis devem ter significado que facilite a leitura do programa (boa prática)
    }
}
