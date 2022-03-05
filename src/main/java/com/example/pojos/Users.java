package com.example.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
	private int id;
	@Column(name="first_name",length = 20, nullable = false)
	private String firstName;
	@Column(name="last_name",length = 20, nullable = false)
	private String lastName;
	@Column(length = 30, nullable = false)
	private String email;
	@Column(length = 10, nullable = false)
	private String password;
	@Column(length = 13, nullable = false)
	private String phone;
	private Role role;
	
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,orphanRemoval=true)//fetch=FetchType.EAGER
		List<OrderDetails> orderDetails=new ArrayList<>(); 
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,orphanRemoval=true)//fetch=FetchType.EAGER
	List<Orders> order=new ArrayList<>();
	
	
	public Users(int id, String firstName, String lastName, String email, String password, String phone, Role role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
