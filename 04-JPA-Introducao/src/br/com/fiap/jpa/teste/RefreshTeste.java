package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Viagem;

public class RefreshTeste {
 
	public static void main(String[] args) {
		
		//Criar a fabrica
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		
		//Criar Entity Manager
		
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar uma viagem
		
		Viagem viagem = em.find(Viagem.class, 1);
		
		// Exibir o destino
		
		System.out.println(viagem.getDestino());
		
		// Setar o destino no objeto (setDestino)
		
		viagem.setDestino("Bauru");
		
		//Exibir o destino
		
		System.out.println(viagem.getDestino());
		
		//Fazer o refresh
		
		em.refresh(viagem);
		
		//Exibir o destino
		
		System.out.println(viagem.getDestino());
		
		//Fechar as paradas
		em.close();
		fabrica.close();
	}
	
}
