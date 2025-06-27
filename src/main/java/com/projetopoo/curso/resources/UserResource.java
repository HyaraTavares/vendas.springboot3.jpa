package com.projetopoo.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetopoo.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
//meu controlador Rest que vai responder no caminho /users
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Hyara", "hyara@gmail.com", "6399999", "123");
		return ResponseEntity.ok().body(u);
		//u que eu estanciei
	
	}
}
