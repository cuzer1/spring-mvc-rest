package com.cuzer.springrestmvc.services;

import java.util.List;

import com.cuzer.springrestmvc.api.v1.model.CategoryDTO;

public interface CategoryService {
	
	List<CategoryDTO> getAllCategories();

	CategoryDTO getCategoryByName(String name);
}
