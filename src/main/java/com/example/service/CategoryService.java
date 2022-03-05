package com.app.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.pojos.Category;
import com.app.pojos.Post;

@Service
public interface CategoryService {


    Category findByName(String name);
    Category addCategory(Category category);

    List<Category> findAll();

    List<String> findAllNames();
    
    List<Post> findPostInCategory(String category);

    Category findById(long categoryId);
}
