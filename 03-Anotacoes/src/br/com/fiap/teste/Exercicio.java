package br.com.fiap.teste;

import br.com.fiap.bean.Aluno;
import br.com.fiap.bean.Veiculo;
import br.com.fiap.orm.Orm;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar um veiculo e aluno
		Aluno aluno = new Aluno();
		Veiculo veiculo = new Veiculo();
		
		//Instanciar o ORM
		Orm orm = new Orm();
		
		//Chamar o método que gera o SQL
		System.out.println(orm.gerarSql(veiculo));
		System.out.println(orm.gerarSql(aluno));
	}
	
}




