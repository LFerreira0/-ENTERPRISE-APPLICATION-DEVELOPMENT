package br.com.fiap.revisao.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.revisao.bean.Aluno;

public class Teste01 {

	public static void main(String[] args) {
		
		//Lista
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(123,20));
		alunos.add(new Aluno(1234,18));
		
		for (Aluno a : alunos) {
			System.out.println(a.getRm() + " " + a.getIdade());
		}
	
		//Mapa<Chave,Valor>
		Map<String, Aluno> mapa = new HashMap<String, Aluno>();
		//Adicionar um aluno no mapa
		mapa.put("laura", new Aluno(7895,19));
		
		//Recuperar o objeto aluno do mapa
		Aluno aluno = mapa.get("laura");
		System.out.println(aluno.getRm());
		
	}
	
}