package com.dscatalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dscatalog.dto.CategoryDTO;
import com.dscatalog.entities.Category;
import com.dscatalog.repositories.CategoryRepository;

import java.util.*;
import java.util.stream.Collectors;

import com.dscatalog.entities.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Transactional(readOnly = true) //Mantém a integridade da transação
	public List<CategoryDTO> findAll()
	{
		List<Category> categorias = categoryRepository.findAll();
		return categorias.stream().map(x-> new CategoryDTO(x)).collect(Collectors.toList());
		
	}
}
