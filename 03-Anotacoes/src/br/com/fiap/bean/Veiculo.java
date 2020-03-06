package br.com.fiap.bean;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TB_VEICULO")
public class Veiculo {

	@Coluna(nome = "nm_marca", obrigatorio = true)
	private String marca;
	
	@Coluna(nome = "ds_modelo")
	private String modelo;
	
	@Coluna(nome = "dt_ano", obrigatorio = true)
	private int ano;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}