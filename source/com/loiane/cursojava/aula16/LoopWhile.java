package com.loiane.cursojava.aula16;

public class LoopWhile {

    public static void main(String[] args) {
        
        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max) { // Primeiro avalia a expressão, se verdadeira executa
            System.out.println("O valor de i: " + i);
            i++; // i = i + 1; ou i += 1;
        }

        System.out.println(i);

        do { // Primeiro executa, depois avalia
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 11);

        System.out.println(i);

    }
    
}
