package com.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dscatalog.dto.CategoryDTO;
import com.dscatalog.entities.Category;
import com.dscatalog.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResources {
	
	@Autowired
	CategoryService categoryService;
	
	//Encontra todas as categorias
	@GetMapping()
	public ResponseEntity<List<CategoryDTO>> findAll()
	{
		 List<CategoryDTO> lista = categoryService.findAll();
		 return ResponseEntity.ok().body(lista);
	}
	
	//Encontra categoria pelo id
	@GetMapping(value="{id}")
	public ResponseEntity<CategoryDTO> findOne(@PathVariable Long id)
	{
		 CategoryDTO categoryDto = categoryService.findById(id);
		 return ResponseEntity.ok().body(categoryDto);
	}
}
