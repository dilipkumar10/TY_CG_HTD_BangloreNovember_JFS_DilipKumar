package com.capgemini.appdevelopment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.appdevelopment.dto.UserInfo;
import com.capgemini.appdevelopment.dto.UsersInfoResponse;
import com.capgemini.appdevelopment.services.UserInfoServices;

import org.springframework.http.MediaType;

public class UserInfoController {
	@Autowired
	private UserInfoServices service;
	@PostMapping(path = "/u-register", produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UsersInfoResponse signup(@RequestBody UserInfo bean) {
		
		UsersInfoResponse usersResponse = new UsersInfoResponse();
		if (service.register(bean)) {
			usersResponse.setStatusCode(201);
			usersResponse.setMessage("success");
			usersResponse.setDescription("registered");
		} else {
			usersResponse.setStatusCode(401);
			usersResponse.setMessage("Failure");
			usersResponse.setDescription("Not registered");
		}
		return usersResponse;
	}
	
	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UsersInfoResponse auth(@RequestBody UserInfo bean) {
		UserInfo info = service.login(bean.getEmail(), bean.getPassword());
		UsersInfoResponse usersInfoResponse = new UsersInfoResponse();
		if (info != null) {
			usersInfoResponse.setStatusCode(201);
			usersInfoResponse.setMessage("success");
			usersInfoResponse.setDescription("found");
			
		} else {
			usersInfoResponse.setStatusCode(401);
			usersInfoResponse.setMessage("Failure");
			usersInfoResponse.setDescription("Not found");
		}
		return usersInfoResponse;
	}
	
	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UsersInfoResponse update(@RequestBody UserInfo bean) {
		UsersInfoResponse usersInfoResponse = new UsersInfoResponse();
		if (service.update(bean.getEmail(), bean.getPassword())) {
			usersInfoResponse.setStatusCode(201);
			usersInfoResponse.setMessage("success");
			usersInfoResponse.setDescription("updated");
			
		} else {
			usersInfoResponse.setStatusCode(401);
			usersInfoResponse.setMessage("Failure");
			usersInfoResponse.setDescription("Not updated");
		}
		return usersInfoResponse;
	
	}
}
