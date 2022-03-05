package com.example.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
	@Column(name="product_name",length=20)
  private String productName;
  private double price;
    @Column(length=100)
  private String description;
  private int quantity;
  private int discount;
  private int rating;
  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="category_id",nullable=false)
  @JsonIgnoreProperties("products")
  private Category category;
  
public Product(int id, String productName, double price, String description, int quantity, int discount, int rating) {
	super();
	this.id = id;
	this.productName = productName;
	this.price = price;
	this.description = description;
	this.quantity = quantity;
	this.discount = discount;
	this.rating = rating;
	
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}

  
}
