package com.capgemini.appdevelopment.services;

import com.capgemini.appdevelopment.dto.ProductInfo;

public interface ProductInfoServices {
	public boolean addProduct(ProductInfo info);
	public ProductInfo getProduct(int id);
}
