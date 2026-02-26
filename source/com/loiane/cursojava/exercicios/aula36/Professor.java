package com.loiane.cursojava.exercicios.aula36;

public class Professor {

    private String nome;
    private String departamento;
    private String email;

    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String obterInfo() {
        return "Professor = " + nome;
    }

}
