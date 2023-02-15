package com.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dscatalog.entities.Category;

@RestController
@RequestMapping(value="/categories")
public class CategoryResources {
	
	@GetMapping()
	public ResponseEntity<List<Category>> findAll()
	{
		 List<Category> lista = new ArrayList();
		 lista.add(new Category(1L, "Books"));
		 lista.add(new Category(2L, "Electronics"));
		 return ResponseEntity.ok().body(lista);
	}
}
