package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Transporte;
import br.com.fiap.jpa.entity.Viagem;

public class CadastroTeste {

	public static void main(String[] args) {
		//Criar a fabrica de Entity Manager
		EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("oracle");
		//Criar o Entity Manager (Gerenciador de entidades)
		EntityManager em = fabrica.createEntityManager();
		
		//Criar uma viagem
		Viagem viagem = new Viagem("Paris", "São Paulo", 
			new GregorianCalendar(2020, Calendar.FEBRUARY, 29, 13, 0),
			new GregorianCalendar(2020, Calendar.MARCH, 10, 8, 30),
			Transporte.ONIBUS, null, 10000);
		
		//Cadastro no banco
		em.persist(viagem);
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar
		em.close();
		fabrica.close();
	}
	
}




