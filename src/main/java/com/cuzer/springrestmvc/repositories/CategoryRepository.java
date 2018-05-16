package com.cuzer.springrestmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuzer.springrestmvc.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
