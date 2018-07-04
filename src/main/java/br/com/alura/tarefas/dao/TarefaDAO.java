package br.com.alura.tarefas.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alura.tarefas.model.Tarefa;

public class TarefaDAO {

	private Tarefa tarefa = new Tarefa();
	
	public Tarefa tarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public void gravar() {
		System.out.println("gravando tarefa " + tarefa.getTitulo());

		try {
			final SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			Date data = formato.parse(tarefa.getPrazo());
			formato.applyPattern("dd/MM/yyyy");
			tarefa.setPrazo(formato.format(data));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("Erro ao modificar data!!!");
		}

		if (tarefa.getTitulo().isEmpty()) {
			throw new RuntimeException("Tarefa deve ter pelo menos um Título.");
		}

		new DAO<Tarefa>(Tarefa.class).adiciona(tarefa);
	}

}
