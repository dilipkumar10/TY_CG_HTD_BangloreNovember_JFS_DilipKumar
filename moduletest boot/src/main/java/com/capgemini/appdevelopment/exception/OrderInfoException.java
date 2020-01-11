package com.capgemini.appdevelopment.exception;

public class OrderInfoException extends RuntimeException {
private String msg;

public OrderInfoException(String msg) {
	super();
	this.msg = msg;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

}
