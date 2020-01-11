package com.capgemini.appdevelopment.exception;

public class ProductInfoException extends RuntimeException{
private String msg;

public ProductInfoException(String msg) {
	super();
	this.msg = msg;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

@Override
public String toString() {
	return "ProductInfoException [msg=" + msg + "]";
}

}
