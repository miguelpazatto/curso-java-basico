package com.loiane.cursojava.aula42;

//final - impede que haja herança (String por exemplo é um caso de utilidade disso)
//quando usado em variaveis as torna CONSTANTES - que são declaradas em CapsLock e underscore (exemplo: URL_SITE)
public final class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String telefoneCelular;

    public Pessoa() {}

    public Pessoa(String nome, String endereco, String telefone) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }
    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    //public abstract String obterEtiquetaEndereço(); //devem ser declarados nas classes filhas

    //public abstract void imprimirEtiquetaEndereco(); 
}
