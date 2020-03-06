package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	private float taxa;
	
	public static final float RENDIMENTO = 0.01f; 
	
	public ContaPoupanca(int numero, int agencia, Calendar dataAbertura, double saldo, float taxa) {
		super(numero, agencia, dataAbertura, saldo);
		this.taxa = taxa;
	}

	public ContaPoupanca() {
		super();
	}

	@Override
	public double calculaRetornoInvestimento() {
		return RENDIMENTO * saldo;
	}

	@Override
	public void retirar(double valor) throws Exception {
		if (valor + taxa > saldo) {
			throw new Exception("Saldo insuficiente");
		}
		saldo -= valor + taxa;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

}