package br.ucsal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ucsal.repositories.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository repository;
}
