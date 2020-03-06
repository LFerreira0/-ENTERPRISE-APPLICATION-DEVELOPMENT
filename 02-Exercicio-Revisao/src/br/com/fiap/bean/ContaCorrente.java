package br.com.fiap.bean;

import java.util.Calendar;

public class ContaCorrente extends Conta {

	private TipoConta tipo;

	@Override
	public void retirar(double valor) throws Exception {
		if (tipo == TipoConta.COMUM && valor > saldo) {
			throw new Exception("Saldo insuficiente");
		}
		saldo -= valor;
	}
	
	public ContaCorrente(int numero, int agencia, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(numero, agencia, dataAbertura, saldo);
		this.tipo = tipo;
	}

	public ContaCorrente() {
		super();
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

}
