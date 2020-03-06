package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Bebida;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.NoDataException;

public interface BebidaDAO {
	
	void cadastrar(Bebida bebida);
	
	void atualizar(Bebida bebida);
	
	Bebida pesquisar(int codigo);
	
	void apagar(int codigo) throws NoDataException;
	
	void commit() throws CommitException;
	
	

}
