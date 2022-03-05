package com.example.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Orders {

	private int id;
	private Users UserId;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL,orphanRemoval=true)//fetch=FetchType.EAGER
	List<OrderDetails> orderDetails=new ArrayList<>(); 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id",nullable=false)
	private Users user;
}
