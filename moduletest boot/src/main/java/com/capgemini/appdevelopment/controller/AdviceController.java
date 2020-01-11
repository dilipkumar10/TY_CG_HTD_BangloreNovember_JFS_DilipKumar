package com.capgemini.appdevelopment.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.appdevelopment.dto.OrderInfoResponse;
import com.capgemini.appdevelopment.exception.OrderInfoException;

@RestControllerAdvice
public class AdviceController {
//	@ExceptionHandler(UsersInfoException.class)
//	public OrderInfoResponse handleEmployeeException(UsersInfoException e) {
//		OrderInfoResponse response=new OrderInfoResponse();
//		response.setStatusCode(501);
//		response.setMessage("Exception");
//		response.setDescription(e.getMsg());
//		return response;
//}
}
