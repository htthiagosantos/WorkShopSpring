package com.aprendizjaveiro.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizjaveiro.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
