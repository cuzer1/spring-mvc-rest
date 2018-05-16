package com.cuzer.springrestmvc.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cuzer.springrestmvc.api.v1.model.CategoryDTO;
import com.cuzer.springrestmvc.domain.Category;

@Mapper
public interface CategoryMapper {
	
	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
	
	CategoryDTO categoryToCategoryDTO(Category category);

}
