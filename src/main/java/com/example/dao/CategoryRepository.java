package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojos.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
