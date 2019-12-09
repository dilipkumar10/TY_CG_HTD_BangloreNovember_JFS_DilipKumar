package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser {
	public static void main(String[] args) {


		UserServices services=UserFactory.instanceOfUserServices();
		UserBean user=new UserBean();
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter email");
		user.setEmail(sc.nextLine());
		System.out.println("Enter username");
		user.setUsername(sc.nextLine());
		System.out.println("enter userid");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		if(services.updateUser(user.getUserid(), user.getUsername(),user.getEmail())) {
			System.out.println("updated");
		}
		else
			System.out.println("smtng went wrong");
		
		
	}
}