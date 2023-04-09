package br.ucsal.dto;

import org.springframework.beans.factory.annotation.Autowired;

import br.ucsal.models.Laboratory;
import br.ucsal.repositories.LaboratoryRepository;

public class LaboratoryDTO {

	@Autowired
	private LaboratoryRepository repository;
	
	private String descriptionLaboratory;
	private Integer machines;
	private String location;
	
	
	public String getDescriptionLaboratory() {
		return descriptionLaboratory;
	}

	public void setDescriptionLaboratory(String descriptionLaboratory) {
		this.descriptionLaboratory = descriptionLaboratory;
	}

	public Integer getMachines() {
		return machines;
	}

	public void setMachines(Integer machines) {
		this.machines = machines;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Object save(Laboratory laboratorio) {
		return repository.save(laboratorio);
	}

}
