package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TB_VIAGEM")
@SequenceGenerator(name="viagem",sequenceName = "SQ_TB_VIAGEM",allocationSize = 1)
public class Viagem {

	@Id
	@Column(name="cd_viagem")
	@GeneratedValue(generator = "viagem", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_destino", nullable = false, length = 50)
	private String destino;
	
	@Column(name="ds_origem", nullable = false, length = 50)
	private String origem;
	
	@Temporal(TemporalType.TIMESTAMP)	
	@Column(name="dt_ida")
	private Calendar dataIda;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_volta")
	private Calendar dataVolta;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_transporte")
	private Transporte transporte;
	
	@Lob
	@Column(name="fl_roteiro")
	private byte[] roteiro;
	
	@Column(name="vl_viagem")
	private double valor;
	
	@Transient
	private double valorTotal;
	
	public Viagem() {
		super();
	}

	public Viagem(String destino, String origem, Calendar dataIda, Calendar dataVolta, Transporte transporte,
			byte[] roteiro, double valor) {
		super();
		this.destino = destino;
		this.origem = origem;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.transporte = transporte;
		this.roteiro = roteiro;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Calendar getDataIda() {
		return dataIda;
	}

	public void setDataIda(Calendar dataIda) {
		this.dataIda = dataIda;
	}

	public Calendar getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(Calendar dataVolta) {
		this.dataVolta = dataVolta;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public byte[] getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(byte[] roteiro) {
		this.roteiro = roteiro;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}