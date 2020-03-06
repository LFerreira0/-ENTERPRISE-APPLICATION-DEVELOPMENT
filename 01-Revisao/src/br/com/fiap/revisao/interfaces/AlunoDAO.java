package br.com.fiap.revisao.interfaces;

import br.com.fiap.revisao.bean.Aluno;

public interface AlunoDAO {

	void deletar(int rm);
	
	void alterar(Aluno aluno);
	
}