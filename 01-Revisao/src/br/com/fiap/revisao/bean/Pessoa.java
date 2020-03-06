package br.com.fiap.revisao.bean;

import java.util.Calendar;

public abstract class Pessoa {
	
	private int idade;
	
	private Calendar dataNascimento;
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	public abstract void respirar();
	
	public void estudar(String disciplina) {
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
