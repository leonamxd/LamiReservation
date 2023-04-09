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
import br.ucsal.dto.LaboratoryDTO;
import br.ucsal.models.Discipline;
import br.ucsal.models.Laboratory;
import br.ucsal.services.DisciplineService;
import br.ucsal.services.LaboratoryService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/laboratorio")
public class LaboratoryController {

	@Autowired
	private LaboratoryService service;
	
	
	@PostMapping
	public ResponseEntity<Object> insert(@RequestBody @Valid LaboratoryDTO _laboratory){
		Laboratory laboratorio = new Laboratory();
		BeanUtils.copyProperties(_laboratory, laboratorio);
		return ResponseEntity.status(HttpStatus.CREATED).body(_laboratory.save(laboratorio));
	}
}
