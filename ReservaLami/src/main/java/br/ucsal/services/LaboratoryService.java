package br.ucsal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ucsal.repositories.LaboratoryRepository;

@Service
public class LaboratoryService {

	@Autowired
	private LaboratoryRepository repository;
}
