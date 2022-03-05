package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojos.OrderStatus;

public interface OrderStatusRepository extends JpaRepository<OrderStatus,Integer>{

}
