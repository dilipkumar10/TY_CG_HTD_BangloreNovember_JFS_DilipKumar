package com.capgemini.forestrymanagementsystemjdbc.exceptions;

public class UsersException extends RuntimeException {
String msg;

public UsersException(String msg) {
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
