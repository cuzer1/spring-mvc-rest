package com.cuzer.springrestmvc.api.v1.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cuzer.springrestmvc.api.v1.model.CategoryDTO;
import com.cuzer.springrestmvc.domain.Category;

public class CategoryMapperTest {
	
	private static final String NAME = "Joe";
	CategoryMapper categoryMapper = CategoryMapper.INSTANCE; 

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCateogryToCategoryDTO() throws Exception {
		
		//given
		Category category = new Category();
		category.setId(1L);
		category.setName(NAME);
		
		//when
		CategoryDTO categoryToCategoryDTO = categoryMapper.categoryToCategoryDTO(category);
		
		//then
		assertEquals(Long.valueOf(1l),	categoryToCategoryDTO.getId());
		assertEquals(NAME, categoryToCategoryDTO.getName());
		
	}

}
