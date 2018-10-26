package com.wsprosystem.model;

public abstract class Departamento {
    private String nome;

    public abstract void calcularDespesasDoMes();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
