package com.loiane.cursojava.exercicios.aula25a27;

public class Lampada {

    String modelo;
    String tensao;
    int potenciaWatts;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;

    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

}
