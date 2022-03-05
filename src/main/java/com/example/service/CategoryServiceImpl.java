package com.app.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CategoryRepository;
import com.app.pojos.Category;
import com.app.pojos.Post;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category findByName(String name) {
		// TODO Auto-generated method stub
		return categoryRepository.findByName(name);
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public List<String> findAllNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category findById(long categoryId) {
		// TODO Auto-generated method stub
		return categoryRepository.getById(categoryId);
	}

	@Override
	public List<Post> findPostInCategory(String category) {
		// TODO Auto-generated method stub
		return null;

	}
}
