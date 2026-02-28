package com.loiane.cursojava.aula43;

import java.util.Arrays;

public class Aluno { 

    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        this.curso = curso;      
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public String obterEtiquetaEndereço() { //sobrepondo e modificando o comportamento do método de Pessoa
        
        String s = "Endereço do Aluno: ";
        //s += this.getEndereco();

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do aluno:");
        System.out.println(this.obterEtiquetaEndereço());
        
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
    }

    /* 
    public String toString() {
        String s =  curso + "\n";
        for (double nota : notas) {
            s += nota + " ";
        }
        return s;
    }
    */

    
}
