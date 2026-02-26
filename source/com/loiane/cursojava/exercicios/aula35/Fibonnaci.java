package com.loiane.cursojava.exercicios.aula35;

public class Fibonnaci {

    public static int fibonacci (int num) {

        if (num < 2) {
            return 1;
        }
        
        return fibonacci(num-1) + fibonacci(num-2);
    }

}
