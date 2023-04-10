package br.ucsal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ucsal.models.Laboratory;
import br.ucsal.repositories.LaboratoryRepository;

@Service
public class LaboratoryService {

	@Autowired
	private LaboratoryRepository laboratoryRepository;
	

	public List<Laboratory> findAll() {
		return laboratoryRepository.findAll();
	}
	
	public void deleteById(Long id) {
		laboratoryRepository.deleteById(id);
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
