package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.bean.Conta;
import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class Teste {

	public static void main(String[] args) {

		//Instanciar uma conta corrente e poupança
		ContaCorrente cc = new ContaCorrente(1, 1, 
				Calendar.getInstance(),	1000, TipoConta.COMUM);
		
		ContaPoupanca cp = new ContaPoupanca(1,  2, 
				Calendar.getInstance(),	200, 1);
		
		//Criar uma lista de contas
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc);
		lista.add(cp);
		lista.add(new ContaCorrente(1, 10, Calendar.getInstance(),
				500, TipoConta.ESPECIAL));
		
		//Exibir o saldo das contas
		for (Conta c : lista) {
			System.out.println(c.getSaldo());
		}
		
		//Chamar o método retirar
		try {
			cc.retirar(10000);
		}catch(Exception e) {
			System.out.println(e.getMessage()); //recupera a mensagem
		}
		
	}
	
}









