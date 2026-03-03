package com.loiane.cursojava.exercicios.aula43;

public class Teste {

    public static void main(String[] args) {
        
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 01");
        p1.setRendaBruta(1000);

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000);

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 01");
        p3.setRendaBruta(2000);

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 02");
        p4.setRendaBruta(3000);

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Contribuinte 01");
        p5.setRendaBruta(3700);

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 02");
        p6.setRendaBruta(4000);

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for (Contribuinte c : contribuintes) {
            System.out.println(c.toString());
        }

    }

}
