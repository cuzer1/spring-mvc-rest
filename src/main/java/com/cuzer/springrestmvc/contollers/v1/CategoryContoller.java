package com.cuzer.springrestmvc.contollers.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cuzer.springrestmvc.api.v1.model.CategoryDTO;
import com.cuzer.springrestmvc.api.v1.model.CategoryListDTO;
import com.cuzer.springrestmvc.services.CategoryService;

@Controller
@RequestMapping("/api/v1/categories/")
public class CategoryContoller {

	private final CategoryService categoryService;

	public CategoryContoller(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping
	public ResponseEntity<CategoryListDTO> getallCatetories() {

		return new ResponseEntity<CategoryListDTO>(new CategoryListDTO(categoryService.getAllCategories()),
				HttpStatus.OK);
	}

	@GetMapping("{name}")
	public ResponseEntity<CategoryDTO> getCategoryByName(@PathVariable String name) {
		return new ResponseEntity<CategoryDTO>(categoryService.getCategoryByName(name), HttpStatus.OK);
	}

}
