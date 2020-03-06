package br.com.fiap.orm;

import br.com.fiap.anotacao.Tabela;

public class Orm {

	public String gerarSql(Object obj) {
		Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
		return "SELECT * FROM " + anotacao.nome();
	}
	
}
