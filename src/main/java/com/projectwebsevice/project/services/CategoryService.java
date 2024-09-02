package com.projectwebsevice.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectwebsevice.project.entities.Category;
import com.projectwebsevice.project.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	//methods
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {	
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
