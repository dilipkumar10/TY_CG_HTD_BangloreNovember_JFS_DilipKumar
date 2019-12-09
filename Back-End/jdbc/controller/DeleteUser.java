package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class DeleteUser {
	public static void main(String[] args) {
		UserServices services=UserFactory.instanceOfUserServices();
		UserBean user=new UserBean();
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter userid");
		user.setUserid(Integer.parseInt(Sc.nextLine()));
		System.out.println("Enter password");
		user.setPassword(Sc.nextLine());
		if(services.deleteUser(user.getUserid(),user.getPassword())) {
			System.out.println("deleted");

		}
		else
			System.out.println("smtng wrong");
	}
}
