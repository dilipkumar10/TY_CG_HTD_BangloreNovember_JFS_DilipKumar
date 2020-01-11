package com.capgemini.appdevelopment.dto;

import javax.persistence.*;

@Entity
@Table
public class ProductInfo {
	@Id
	@GeneratedValue
	@Column
private int id;
	@Column
private int user_id;
	@Column(unique = true,nullable = false)
private String name;
	@Column
private int quantity;
	@Column
private String details;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", user_id=" + user_id + ", name=" + name + ", quantity=" + quantity
				+ ", details=" + details + "]";
	}
	
}
