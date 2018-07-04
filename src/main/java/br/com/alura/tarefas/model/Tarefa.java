package br.com.alura.tarefas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefa {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String descricao;
	private String prazo;	

	public String getTitulo() {
		return titulo;
	}

	public String getPrazo() {
		return prazo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
