package com.capgemini.forestrymanagementsystemjdbc.exceptions;

public class CustomerExceptions extends RuntimeException{
String msg;

public CustomerExceptions(String msg) {
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
