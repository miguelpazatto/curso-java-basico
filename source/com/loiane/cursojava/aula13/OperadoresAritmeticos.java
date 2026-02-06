package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {
    
    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Miguel";
        String segundoNome = " Pazatto";
        String nomeCompleto = primeiroNome + segundoNome;
        System.out.println(nomeCompleto);

        resultado++; // == resultado + 1 -> tomar cuidado ordem em print 
        System.out.println(resultado); 

        ++resultado; // == 1 + resultado
        System.out.println(resultado);
    }
}
