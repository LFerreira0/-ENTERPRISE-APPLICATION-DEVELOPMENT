package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Viagem;

public class RemoveTeste {

	public static void main(String[] args) {
		// Criar a fabrica
		
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("oracle");
		
		//Criar o Entity Manager
		
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar uma viagem
		
		Viagem viagem = em.find(Viagem.class, 1);
		
		//Remover a viagem
		
		em.remove(viagem);
				
		//Commit
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar as paradas

		em.close();
		fabrica.close();
	}

}
