package br.ucsal.dto;

import org.springframework.beans.factory.annotation.Autowired;

import br.ucsal.models.Discipline;
import br.ucsal.repositories.DisciplineRepository;

public class DisciplineDTO {

	@Autowired
	private DisciplineRepository repository;

	private String name;

	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Discipline save(Discipline disciplina) {
		return repository.save(disciplina);
	}

}
