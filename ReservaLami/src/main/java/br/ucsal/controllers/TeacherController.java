package br.ucsal.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.dto.TeacherDTO;
import br.ucsal.models.Teacher;
import br.ucsal.models.User;
import br.ucsal.services.TeacherService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/professor")
public class TeacherController {

	@Autowired
	private TeacherService service;
	
	
	@PostMapping
	public ResponseEntity<Object> insert(@RequestBody @Valid TeacherDTO _teacher){
		Teacher professor = new Teacher();
		BeanUtils.copyProperties(_teacher, professor);
		return ResponseEntity.status(HttpStatus.CREATED).body(_teacher.save(professor));
	}
}
