package com.loiane.cursojava.aula52;

public class UsandoMinhaException {

        public static void main(String[] args) {
            
            int[] numeros = {4, 8, 16, 32, 64, 128};
            int[] denominadores = {2, 0 , 4, 8, 0};

            for (int i = 0; i < numeros.length; i++) {
                try {
                    if (numeros[i] % 2 != 0) {
                        //lançar a exception aqui
                        //throw new Exception("Número ímpar, divisão não exata");
                        throw new DivisaoNaoExata(numeros[i], denominadores[i]);
                    }
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
                } 
                catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) { 
                    System.out.println("Aconteceu um erro");
                    e.printStackTrace();
                }

        }

    }   

}
