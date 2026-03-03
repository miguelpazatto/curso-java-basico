package com.loiane.cursojava.aula49;

public class Pegadinha {

    public static void main(String[] args) {
        
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0 , 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
            System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            } 
            catch (ArithmeticException e) { //sempre exceções mais especificas e depois as mais ganéricas
                System.out.println("Erro ao dividir por zero");
                System.exit(0); //termina a execução do programa, finally NÃO é executado nesse caso
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválida");
                System.exit(0);
            }
            finally {
                System.out.println("Essa linha é impressa sempre após o try ou catch");
            }
        }

    }

}
