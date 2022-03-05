package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojos.OrderStatus;
import com.example.pojos.Orders;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {

}
