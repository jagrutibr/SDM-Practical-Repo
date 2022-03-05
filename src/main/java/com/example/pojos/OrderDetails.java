package com.example.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class OrderDetails {
     
	private int id;
	private String productName;
	private double finalPrice;
	private int quantity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="order_id",nullable=false)
   	private Orders order;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id",nullable=false)
	private Users user;
	public OrderDetails(int id, String productName, double finalPrice, int quantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.finalPrice = finalPrice;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
