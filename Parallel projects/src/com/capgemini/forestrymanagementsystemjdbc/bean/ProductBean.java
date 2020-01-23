package com.capgemini.forestrymanagementsystemjdbc.bean;

import java.io.Serializable;

public class ProductBean implements Serializable{
private int productId;
private String ProductName;
private double quantity;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public double getQuantity() {
	return quantity;
}
public void setQuantity(double quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "productId=" + productId + ", ProductName=" + ProductName + ", quantity=" + quantity;
}


}
