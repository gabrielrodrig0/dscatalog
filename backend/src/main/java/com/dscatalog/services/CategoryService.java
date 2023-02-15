package com.dscatalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dscatalog.entities.Category;
import com.dscatalog.repositories.CategoryRepository;

import java.util.*;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	public List<Category> findAll()
	{
		return categoryRepository.findAll();
	}
}
