package br.ucsal.models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_discipline")
public class Discipline {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long disciplineId;
	private String nameDiscipline;
	private String descriptionDiscipline;
	
	public Long getDisciplineId() {
		return disciplineId;
	}
	public void setDisciplineId(Long disciplineId) {
		this.disciplineId = disciplineId;
	}
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
}
