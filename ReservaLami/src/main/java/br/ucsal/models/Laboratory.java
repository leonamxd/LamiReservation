package br.ucsal.models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_laboratory")
public class Laboratory {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long laboratoryId;
	private String descriptionLaboratory;
	private StatusLaboratory statusLaboratory;
	private Integer machines;
	private String location;
	
	public Long getLaboratoryId() {
		return laboratoryId;
	}
	public void setLaboratoryId(Long laboratoryId) {
		this.laboratoryId = laboratoryId;
	}
	public String getDescriptionLaboratory() {
		return descriptionLaboratory;
	}
	public void setDescriptionLaboratory(String descriptionLaboratory) {
		this.descriptionLaboratory = descriptionLaboratory;
	}
	public StatusLaboratory getStatusLaboratory() {
		return statusLaboratory;
	}
	public void setStatusLaboratory(StatusLaboratory statusLaboratory) {
		this.statusLaboratory = statusLaboratory;
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
	
	public void searchAvailability() {
		
	}
	
	public void getClassroomInfo() {
		
	}
	
	public void approveReservation() {
		
	}
	
	public void calcelReservation() {
		
	}
}
