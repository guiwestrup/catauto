package com.wsprosystem.model;

import javax.persistence.*;

@Entity
public class DetalheMarca {

	@Id
	@GeneratedValue
	private Long id;
	private Integer anoFundacao;
	private String paisOrigem;
	private String fundador;
	@OneToOne(mappedBy="detalheMarca", cascade= CascadeType.ALL)
	private Marca marca;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(Integer anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getFundador() {
		return fundador;
	}

	public void setFundador(String fundador) {
		this.fundador = fundador;
	}

	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
		if(marca.getDetalheMarca() != this){
			marca.setDetalheMarca(this);
		}
	}
}
