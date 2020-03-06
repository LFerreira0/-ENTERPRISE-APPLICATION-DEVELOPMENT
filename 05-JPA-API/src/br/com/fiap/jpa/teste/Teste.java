package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.dao.BebidaDAO;
import br.com.fiap.jpa.dao.impl.BebidaDAOImpl;
import br.com.fiap.jpa.entity.Bebida;
import br.com.fiap.jpa.entity.Tipo;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.NoDataException;

public class Teste {
	
	public static void main(String[] args) {
		
		//Criar a fabrica
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		//Instanciar o entity manager
		
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar uma BebidaDAOIml...
		
		BebidaDAO dao = new BebidaDAOImpl(em);
		
		//Istanciar a bebida que ser� cadastrada
		
		Bebida refri = new Bebida("Dolly Cola 350ml", 0,
				new GregorianCalendar(2020, Calendar.AUGUST, 10),
				3, Tipo.REFRIGERANTE);
		
		
		//Cadastrar uma bebida
		
		
		try {
			dao.cadastrar(refri);
			dao.commit();
			System.out.println("Cadastrado com suceso");
		}catch(CommitException e) {
			System.out.println("Erro ao cadastrar");
		}
		
		//Buscar uma bebida
		
		Bebida busca = dao.pesquisar(refri.getCodigo());
		System.out.println(busca.getNome());
		
		//Atualizar uma bebida
		
		try {
			busca.setNome("Pepsi");
			dao.atualizar(busca);
			dao.commit();
			System.out.println("Bebida atualizada");
		}catch(CommitException e) {
			System.out.println("Erro ao atualizar");
		}
		
		//Remover uma bebida
		
		try {
			dao.apagar(busca.getCodigo());
			dao.commit();
		}catch(NoDataException e) {
			System.out.println("Bebida n�o encontrada");
		}catch(CommitException e) {
			System.out.println("Erro ao remover");
		}
		
		//Fechar as paradas
		
		em.close();
		fabrica.close();
	}
	
	
}