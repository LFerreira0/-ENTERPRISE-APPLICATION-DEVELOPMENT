package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="TB_BEBIDA")
public class Bebida {
	
	
	@Id
	@Column(name="cd_bebida")
	@GeneratedValue(generator = "bebida", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_bebida", nullable = false, length =30)
	private String nome;
	
	@Column(name="nr_alcool")
	private float teorAlcolico;
	
	@Column(name="dt_vencimento")
	private Calendar dataVencimento;
	
	@Column(name="vl_bebida")
	private float valor;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_tipo")
	private Tipo tipo;
	public Bebida() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getTeorAlcolico() {
		return teorAlcolico;
	}

	public void setTeorAlcolico(float teorAlcolico) {
		this.teorAlcolico = teorAlcolico;
	}
	
	@Temporal(TemporalType.DATE)
	public Calendar getVencimento() {
		return dataVencimento;
	}

	public void setVencimento(Calendar vencimento) {
		this.dataVencimento = vencimento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	
	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	
	public Bebida(String nome, float teorAlcolico, Calendar dataVencimento, float valor, Tipo tipo) {
		super();
		this.nome = nome;
		this.teorAlcolico = teorAlcolico;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
		this.tipo = tipo;
	}

}
