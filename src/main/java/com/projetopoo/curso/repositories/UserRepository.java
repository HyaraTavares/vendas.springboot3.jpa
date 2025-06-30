package com.projetopoo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetopoo.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
