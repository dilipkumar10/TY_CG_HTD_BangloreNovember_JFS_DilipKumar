package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.ProductBean;

public interface ProductDao {
	public boolean  addProduct(ProductBean bean);
	public boolean modifyProduct(int ProductId,String productName);
	public boolean modifyprodquantity(int productId,double productQuantity);
	public boolean deleteProduct(int ProductId);
	public List<ProductBean> getAllProducts();
	public ProductBean searchProduct(int product_id);
}
