package br.ucsal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ucsal.repositories.DisciplineRepository;

@Service
public class DisciplineService {

	@Autowired
	private DisciplineRepository repository;
}
