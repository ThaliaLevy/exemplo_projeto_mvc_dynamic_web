package model.entidade;

import model.persistencia.PCarro;

public class Carro {
	private String nome;
	private String placa;
	private String marca;
	private int ano;
	
	public Carro() {
		
	}
	
	public Carro(String nome, String placa, String marca, int ano) {
		this.nome = nome;
		this.placa = placa;
		this.marca = marca;
		this.ano = ano;
	}
	
	public boolean tratarDados() {
		PCarro pc = new PCarro();
		if(pc.create(this) == true) {
			return true;
		}else {
			return false;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
