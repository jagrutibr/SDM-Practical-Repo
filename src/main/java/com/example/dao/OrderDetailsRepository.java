package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojos.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Integer>{

}
