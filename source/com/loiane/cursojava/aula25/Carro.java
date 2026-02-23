package com.loiane.cursojava.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; 
	double capCombustivel; 
	double consumoCombustivel;

    void exibirAutonomia() { //método começa com o tipo de retorno, método simples não retorna nada (por isso void)
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {
            double qtdCombustivel = km / consumoCombustivel;
            return qtdCombustivel;
        }

}
