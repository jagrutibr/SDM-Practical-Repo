package com.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.CategoryRepository;
import com.app.pojos.Category;
import com.app.pojos.Post;

public class CategoryRepositoryImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category findByName(String name) {	
		return categoryRepository.findByName(name);
	}

	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public List<String> findAllNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findById(long categoryId) {
		// TODO Auto-generated method)
		return categoryRepository.getById(categoryId);
	}

	@Override
	public List<Post> findPostInCategory(String category) {
		return null;
	}

}
