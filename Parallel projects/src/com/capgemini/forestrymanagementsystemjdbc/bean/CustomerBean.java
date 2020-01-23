package com.capgemini.forestrymanagementsystemjdbc.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerBean implements Serializable{
	private int customerId;
	private String customerName;
	private String streetAddress1;
	private String streetAddress2;
	private String town;
	private long postalCode;
	private String email;
	private Long telePhoneNum;
}
