package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.Validations;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.UsersException;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;
import com.capgemini.forestrymanagementsystemjdbc.services.AdminServices;

public class Application {
	static UsersBean bean=new UsersBean();
	static AdminServices services = Factory.adminServiceMethod();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (true) {
			System.out.println("Welcome to forestry application");
			System.out.println("Press 1 for Admin");
			System.out.println("press 2 for Client");
			System.out.println("press 3 for Scheduler");
			String choice = scanner.nextLine();
			switch (Validations.isNumber2(choice)) {
			case 1:
				while (true) {
					System.out.println("press 1 for login");
					System.out.println("press 2 for signup");
					System.out.println("press 3 to go back");
					String input = scanner.nextLine();
					switch (Validations.isNumber2(input)) {
					case 1:status=true;
						while(status==true) {
						System.out.println("Enter username");
						String username=scanner.nextLine();
						if(Validations.isName(username)) {
							bean.setUserName(username);
							status=false;
						}else {
							System.err.println("Invalid username");
						}
					}
						status = true;
						while (status == true) {
							System.out.println("Enter password");
							String input1 = scanner.nextLine();
							int strength = Validations.calculatePasswordStrength(input1);
							if (strength == 10) {
								status = false;
								bean.setPassword(input1);
							} else {
								System.err.println(
										"The password is wrong(Hint-Enter the password that should contain atleast 8 digits)"
												+ "It must include uppercase,lowercase,speacial character and integers");
							}
						}
						try {
						if (services.login(bean.getUserName(), bean.getPassword())) {
							System.out.println("Login successful");
							Admin.land();
						} 
						}catch(UsersException e) {
							System.err.println(e.getMsg());
						}
						break;
					case 2:
						bean.setRole("Admin");
						status=true;
						while(status==true) {
							System.out.println("Enter username");
							String username=scanner.nextLine();
							if(Validations.isName(username)) {
								bean.setUserName(username);
								status=false;
							}else {
								System.err.println("Invalid username");
							}
						}
						status = true;
						while (status == true) {
							System.out.println("Enter password");
							String password = scanner.nextLine();
							int strength = Validations.calculatePasswordStrength(password);
							if (strength == 10) {
								status = false;
								bean.setPassword(password);
							} else {
								System.err.println(
										"The password is weak(Enter the password that should contain atleast 7 digits)"
												+ "It must include uppercase,lowercase,speacial character and integers");
							}
						}
						status = true;
						while (status == true) {
							System.out.println("Enter email");
							String email = scanner.nextLine();
							if (Validations.isValid(email)) {
								bean.setEmail(email);
								status = false;
							} else
								System.err.println("Invalid email");
						}
						try {
						if (services.signup(bean)) {
							System.out.println("Registered successfully");
						}
						}catch(UsersException e) {
							System.err.println(e.getMsg());
						}
						break;
					case 3:
						Application.main(null);
						break;
					default:
						System.err.println("Invalid choice");
						break;
					}
				}
			case 2:
				Client.m1();
				break;
			case 3:
				Scheduler.main();
				break;
			default:System.err.println("Invalid choice");
			}

		}

	}

}
