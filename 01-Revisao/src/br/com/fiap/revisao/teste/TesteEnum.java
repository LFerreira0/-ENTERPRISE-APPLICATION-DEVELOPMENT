package br.com.fiap.revisao.teste;

import br.com.fiap.revisao.bean.Aluno;
import br.com.fiap.revisao.bean.Genero;

public class TesteEnum {

	public static void main(String[] args) {
		//Atribuir um genero para o aluno
		Aluno aluno = new Aluno(789,18);
		aluno.setGenero(Genero.FEMININO);
		
		//Validar se o aluno é do sexo feminino
		if (aluno.getGenero() == Genero.FEMININO){
			System.out.println("Aluna");
		}
		
	}
	
}