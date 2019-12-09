package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UserLogin {

	public static void main(String[] args) {
		UserServices services=UserFactory.instanceOfUserServices();
		Scanner Sc=new Scanner(System.in);
		UserBean user=new UserBean();
		System.out.println("Enter username");
		user.setUsername(Sc.nextLine());
		System.out.println("Enter password");
		user.setPassword(Sc.nextLine());
		UserBean u=services.userLogin(user.getUsername(), user.getPassword());
		if(u!=null) {
			System.out.println("username="+u.getUsername());
			System.out.println("userid="+u.getUserid());
			System.out.println("email="+u.getEmail());
		}else
			System.out.println("smtng wrong");
		

	}

}
