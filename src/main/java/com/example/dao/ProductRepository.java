package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pojos.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}
