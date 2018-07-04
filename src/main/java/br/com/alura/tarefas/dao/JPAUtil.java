package br.com.alura.tarefas.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil {

	private static EntityManagerFactory emf;
	
	public EntityManager getEntityManager() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("tarefas");
		}
		return emf.createEntityManager();
	}
	
	public void close(EntityManager em) {
		em.close();
	}
	
}
