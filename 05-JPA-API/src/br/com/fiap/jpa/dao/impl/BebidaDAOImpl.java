package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.BebidaDAO;
import br.com.fiap.jpa.entity.Bebida;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.NoDataException;

public class BebidaDAOImpl implements BebidaDAO{
	
	public EntityManager em;
	
	public BebidaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}


	@Override
	public void cadastrar(Bebida bebida) {
		
		em.persist(bebida);
		
	}

	@Override
	public void atualizar(Bebida bebida) {
		em.merge(bebida);
	}
		
	@Override
	public Bebida pesquisar(int codigo) {
		return em.find(Bebida.class, codigo);
		
	}

	@Override
	public void apagar(int codigo) throws NoDataException {
		
		Bebida bebida = pesquisar(codigo);
		//valida se existe uma bebida para ser removida
		if(bebida == null) {
			throw new NoDataException();
		}
		
		em.remove(bebida);
		
		
	}

	@Override
	public void commit() throws CommitException {
		try {
			
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		}catch(Exception e) {
			
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}

}
