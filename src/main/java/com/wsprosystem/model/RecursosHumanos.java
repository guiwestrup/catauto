package com.wsprosystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RecursosHumanos extends Departamento {
    @Id
    @GeneratedValue
    private Long id;

    @Override
    public void calcularDespesasDoMes() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
