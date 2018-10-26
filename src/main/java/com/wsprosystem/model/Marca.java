package com.wsprosystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Marca {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToOne(cascade = CascadeType.ALL)
	private DetalheMarca detalheMarca;
	//fetch=FetchType.EAGER,
	@OneToMany(mappedBy = "marca",  cascade= CascadeType.ALL)
	private List<Modelo> modelos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DetalheMarca getDetalheMarca() {
		return detalheMarca;
	}

	public void setDetalheMarca(DetalheMarca detalheMarca) {
		this.detalheMarca = detalheMarca;
		if (detalheMarca.getMarca() != this) {
			detalheMarca.setMarca(this);
		}
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

	public void addModelo(Modelo modelo) {
		if (this.modelos == null) {
			this.modelos = new ArrayList<Modelo>();
		}
		this.modelos.add(modelo);
		if (modelo.getMarca() != this) {
			modelo.setMarca(this);
		}
	}
}
