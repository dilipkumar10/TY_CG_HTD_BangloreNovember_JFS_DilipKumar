package com.capgemini.forestrymanagementsystemjdbc.services;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.ProductBean;
import com.capgemini.forestrymanagementsystemjdbc.dao.ProductDao;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;

public class ProductServicesImpl implements ProductServices {
	ProductDao d=Factory.ProductDao();
	@Override
	public boolean addProduct(ProductBean bean) {
		// TODO Auto-generated method stub
		return d.addProduct(bean);
	}

	@Override
	public boolean modifyProduct(int ProductId,String productName) {
		// TODO Auto-generated method stub
		return d.modifyProduct(ProductId,productName);
	}

	@Override
	public boolean deleteProduct(int ProductId) {
		// TODO Auto-generated method stub
		return d.deleteProduct(ProductId);
	}

	@Override
	public List<ProductBean> getAllProducts() {
		// TODO Auto-generated method stub
		return d.getAllProducts();
	}

	@Override
	public boolean modifyprodquantity(int productId, double productQuantity) {
		// TODO Auto-generated method stub
		return d.modifyprodquantity(productId, productQuantity);
	}

	@Override
	public ProductBean searchProduct(int product_id) {
		// TODO Auto-generated method stub
		return d.searchProduct(product_id);
	}
	

}
