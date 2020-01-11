package com.capgemini.appdevelopment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import com.capgemini.appdevelopment.dto.ProductInfo;
import com.capgemini.appdevelopment.dto.ProductInfoResponse;
import com.capgemini.appdevelopment.services.ProductInfoServices;

public class ProductInfoController {
	@Autowired
	private ProductInfoServices services;
	@PostMapping(path="/register-product",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse addProduct(@RequestBody ProductInfo bean) {
		ProductInfoResponse response=new ProductInfoResponse();
		if(services.addProduct(bean)) {
			response.setStatusCode(200);
			response.setMessage("registered successfully");
			response.setDescription("product registered");
			
		}else {
			response.setStatusCode(400);
			response.setMessage("not registered");
			response.setDescription("Id already exists");
		}
		return response; 
	}
	
	@GetMapping(path = "/search-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse search(int id) {
		ProductInfoResponse response=new ProductInfoResponse();
		ProductInfo info=services.getProduct(id);
		if(info!=null) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("employee not found");
		}else {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("employee  found");
		}
		return response;
	}
}
