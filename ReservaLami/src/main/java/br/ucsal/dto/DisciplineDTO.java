package br.ucsal.dto;

import org.springframework.beans.factory.annotation.Autowired;

import br.ucsal.models.Discipline;
import br.ucsal.repositories.DisciplineRepository;

public class DisciplineDTO {
	
	@Autowired
	private DisciplineRepository repository;
	
	private String nameDiscipline;
	private String descriptionDiscipline;
	

	public String getNameDiscipline() {
		return nameDiscipline;
	}

	public void setNameDiscipline(String nameDiscipline) {
		this.nameDiscipline = nameDiscipline;
	}

	public String getDescriptionDiscipline() {
		return descriptionDiscipline;
	}

	public void setDescriptionDiscipline(String descriptionDiscipline) {
		this.descriptionDiscipline = descriptionDiscipline;
	}

	public Object save(Discipline disciplina) {
		return repository.save(disciplina);
	}

}
