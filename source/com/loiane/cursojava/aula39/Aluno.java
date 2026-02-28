package com.loiane.cursojava.aula39;

public class Aluno extends Pessoa { 

    private String curso;
    private double[] notas;

    public void verificarAcesso() {
        this.nomeVisibilidade = "sdadadad";
        super.nomeVisibilidade = "sdadadad";
    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone); //usamos quando queremos fazer referência a super classe
        this.curso = curso;      //da pra usar métodos usando super ou this, vai a gosto
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

}
