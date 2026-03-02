package com.loiane.cursojava.exercicios.aula43;

public abstract class Contribuinte {

    private String nome;
    private double rendaBruta;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getRendaBruta() {
        return rendaBruta;
    }
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto(); //apenas assinatura pois o cálculo vai pra pf ou pj

    @Override
    public String toString() {
        String s = "Nome: " + nome;
        s += "Renda bruta: " + rendaBruta;

        return s;
    }

}
