package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Transporte;
import br.com.fiap.jpa.entity.Viagem;

public class AtualizaTeste {

	public static void main(String[] args) {
		//Criar a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		//Criar o entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Criar uma viagem com um código que existe no banco
		Viagem viagem = new Viagem("China", "São Paulo", 
			Calendar.getInstance(), null, Transporte.NAVIO, null, 1000);
		
		viagem.setCodigo(1);
		
		//Atualizar
		em.merge(viagem);
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar as paradas
		em.close();
		fabrica.close();
	}
	
}




