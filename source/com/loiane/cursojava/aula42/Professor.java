package com.loiane.cursojava.aula42;

public class Professor extends Pessoa { // henraça - relacionamento do tipo: é um / é uma
                                        // logo, professor é uma pessoa

    private double salario;
    private String nomeCurso;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }

    public String obterEtiquetaEndereço() { //sobrepondo e modificando o comportamento do método de Pessoa
        
        String s = "Endereço do Professor: ";
        s += this.getEndereco();

        return s;
    }
    
    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do professor:");
        System.out.println(this.obterEtiquetaEndereço());
        
        
    }
    
}
