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
@Table(name="TB_BLOQUINHO")
//sequenceName -> nome da sequencia no banco de dados
//name -> nome da sequencia no Java, utilizado no @GeneratedValue
//allocationSize -> incremento
@SequenceGenerator(sequenceName = "SQ_TB_BLOQUINHO", name = "bloq", allocationSize = 1)
public class Bloquinho {

	@Id
	@Column(name="cd_bloquinho")
	@GeneratedValue(generator = "bloq", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name="nm_bloquinho", nullable = false, length = 25)
	private String nome;
	
	@Column(name="nm_artista", length = 50)
	private String artista;
	
	@Temporal(TemporalType.TIMESTAMP) //grava a data e hora
	@Column(name="dt_bloquinho")
	private Calendar data;
	
	@Column(name="nr_publico")
	private int publico;
	
	@Column(name="vl_ingresso")
	private double valor;
	
	//Atributo que não será uma coluna no banco de dados
	@Transient
	private double faturamentoTotal;
	
	//Gravar um arquivo no banco de dados
	@Lob
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING) //grava a string no banco
	@Column(name="ds_acesso")
	private Acesso acesso;

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

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public int getPublico() {
		return publico;
	}

	public void setPublico(int publico) {
		this.publico = publico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getFaturamentoTotal() {
		return faturamentoTotal;
	}

	public void setFaturamentoTotal(double faturamentoTotal) {
		this.faturamentoTotal = faturamentoTotal;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}
	
}








