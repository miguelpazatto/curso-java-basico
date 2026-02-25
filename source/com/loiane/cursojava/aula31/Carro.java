package com.loiane.cursojava.aula31;

// public = qualquer pacote ou classe pode ver essa
// default = só pode ser vista por classes do mesmo pacote
// private = permite ver apenas dentro da própria classe
public class Carro { 

    public String marca; //permite que a marca seja vista por outros pacotes/classes
	String modelo;
	int numPassageiros; 
	double capCombustivel; 
	private double consumoCombustivel; //tirando acesso a essa variavel em outros pacotes e classes

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
