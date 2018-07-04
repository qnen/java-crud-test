package br.com.alura.tarefas.dao;

import javax.persistence.EntityManager;

import br.com.alura.tarefas.model.Tarefa;

public class PopulaBanco {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		Tarefa ingles = geraTarefa("Estudar Inglês", "Assistir Troia em ingles para fixar os conhecimentos do ultimo estudo", "15/04 - 5 dias");
		em.persist(ingles);
		
		Tarefa rede = geraTarefa("Alterar rede de casa", "Fazer alteracao na rede de casa", "19/04 - 9 dias");
		em.persist(rede);
		
		Tarefa carro = geraTarefa("Problema do carro", "Fazer revisao no carro e arrumar o vazamento de óleo", "12/04 - 2 dias");
		em.persist(carro);
		
		Tarefa notebook = geraTarefa("Vendar notebook", "Anunciar o notebook online para venda", "20/05 - Mais de um mês");
		em.persist(notebook);
		
		Tarefa projetoEscola = geraTarefa("Sistema Escolar", "Terminar o sistema para a escola do bairro", "25/04 - 15 dias");
		em.persist(projetoEscola);
		
		Tarefa piscina = geraTarefa("Limpeza da piscina", "Fazer a limpeza da piscina para o churrasco dia 19/04", "18/04 - 8 dias");
		em.persist(piscina);
		
		em.getTransaction().commit();
		
		em.close();
	}
	
	private static Tarefa geraTarefa(String titulo, String descricao, String prazo){
		Tarefa tarefa = new Tarefa();
		tarefa.setTitulo(titulo);
		tarefa.setDescricao(descricao);
		tarefa.setPrazo(prazo);
		return tarefa;
	}
	
}
