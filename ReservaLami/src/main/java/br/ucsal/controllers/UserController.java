package br.ucsal.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.dto.UserDTO;
import br.ucsal.models.User;
import br.ucsal.services.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UserController {

	@Autowired
	private UserService service;
	
	
	@PostMapping
	public ResponseEntity<Object> insert(@RequestBody @Valid UserDTO _user){
		User usuario = new User();
		BeanUtils.copyProperties(_user, usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(_user.save(usuario));
	}
}
