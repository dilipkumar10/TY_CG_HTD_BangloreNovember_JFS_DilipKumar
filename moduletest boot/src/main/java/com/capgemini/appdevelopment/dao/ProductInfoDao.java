package com.capgemini.appdevelopment.dao;

import com.capgemini.appdevelopment.dto.ProductInfo;

public interface ProductInfoDao {
public boolean addProduct(ProductInfo info);
public  ProductInfo getProduct(int id);
}
