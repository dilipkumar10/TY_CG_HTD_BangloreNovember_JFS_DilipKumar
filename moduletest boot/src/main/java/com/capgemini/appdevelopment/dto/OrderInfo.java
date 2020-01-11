package com.capgemini.appdevelopment.dto;

import javax.persistence.*;


@Entity
@Table
public class OrderInfo {
	@Id
	@GeneratedValue
	@Column
private int id;
	@Column
private int product_id;
	@Column
private int user_id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
@Override
public String toString() {
	return "OrderInfo [id=" + id + ", product_id=" + product_id + ", user_id=" + user_id + "]";
}

}
