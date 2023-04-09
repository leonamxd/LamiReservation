package br.ucsal.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.dto.DisciplineDTO;
import br.ucsal.models.Discipline;
import br.ucsal.services.DisciplineService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/disciplina")
public class DisciplineController {

	@Autowired
	private DisciplineService service;
	
	
	@PostMapping
	public ResponseEntity<Object> insert(@RequestBody @Valid DisciplineDTO _discipline){
		Discipline disciplina = new Discipline();
		BeanUtils.copyProperties(_discipline, disciplina);
		return ResponseEntity.status(HttpStatus.CREATED).body(_discipline.save(disciplina));
	}
}
