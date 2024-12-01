package com.aprendizjaveiro.cursospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendizjaveiro.cursospring.entities.User;
import com.aprendizjaveiro.cursospring.repositories.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository repository;
	
	public List<User> findALL(){
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
}
