package com.loiane.cursojava.aula32;

// encapsulamento é a prática de não expor diretamente os atributos para manipulação
public class Carro {

    private String marca; 
	private String modelo;
	private int numPassageiros; 
	private double capCombustivel; 
	private double consumoCombustivel;

    public String getMarca() { //método get
        return this.marca;
    }

    public void setMarca(String marca) { // método set - sempre é void porque não tem retorno
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) { 
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

}
