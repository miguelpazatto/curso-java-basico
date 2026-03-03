package com.loiane.cursojava.aula47;

public class MultiplosCatch {

    public static void main(String[] args) {
        
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0 , 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
            System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            } 
            catch (ArithmeticException e) { //sempre exceções mais especificas e depois as mais ganéricas
                System.out.println("Erro ao dividir por zero");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválida");
            }
        }

    }

}
