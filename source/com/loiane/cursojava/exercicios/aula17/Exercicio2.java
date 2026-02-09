package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Exercicio2 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            
            String nome;
            String senha;

            System.out.println("Digite seu nome: ");
            nome = scan.next();
            System.out.println("Digite sua senha: ");
            senha = scan.next();

            while (nome.equals(senha)) {
                System.out.println("Seu nome não pode ser igual a sua senha! Digite novamente:");
                System.out.println("Seu nome: ");
                nome = scan.next();
                System.out.println("Sua senha: ");
                senha = scan.next(); 
            }

            System.out.println("Nome e senha válidos!");

        }

}
