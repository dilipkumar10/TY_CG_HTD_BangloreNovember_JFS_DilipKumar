package com.capgemini.forestrymanagementsystemjdbc.exceptions;

public class LandException extends RuntimeException{
String msg;

public LandException(String msg) {
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
