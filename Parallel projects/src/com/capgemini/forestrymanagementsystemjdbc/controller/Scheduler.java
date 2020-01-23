package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.Validations;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.UsersException;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;
import com.capgemini.forestrymanagementsystemjdbc.services.ContractorServices;
import com.capgemini.forestrymanagementsystemjdbc.services.CustomerServices;
import com.capgemini.forestrymanagementsystemjdbc.services.ProductServices;
import com.capgemini.forestrymanagementsystemjdbc.services.SchedulerServices;

public class Scheduler {
	static ContractorServices contractServices = Factory.contractorServices();
	static ProductServices productServices = Factory.productServices();
	static CustomerServices customerServices=Factory.customerServices();
	static UsersBean usersBean = new UsersBean();
	static SchedulerServices schedulerService = Factory.schedulerServices();

	public static void main() {
		SchedulerServices services = Factory.schedulerServices();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("press 1 for login");
			System.out.println("press 2 for signup");
			System.out.println("Press 3 to go back");
			String choice1 = sc.nextLine();
			switch (Validations.isNumber2(choice1)) {
			case 1:flag=true;
				while(flag==true) {
				System.out.println("Enter username");
				String username=sc.nextLine();
				if(Validations.isName(username)) {
					usersBean.setUserName(username);
					flag=false;
				}else {
					System.err.println("Invalid username");
				}
			}
				flag = true;
				while (flag == true) {
					System.out.println("Enter password");
					String password = sc.nextLine();
					int strength = Validations.calculatePasswordStrength(password);
					if (strength == 10) {
						flag = false;
						usersBean.setPassword(password);
					} else {
						System.err.println(
								"The password is wrong(Hint-Enter the password that should contain atleast 8 digits)"
										+ "It must include uppercase,lowercase,speacial character and integers");
					}
				}
				try {
					if (services.login(usersBean.getUserName(), usersBean.getPassword())) {
						System.out.println("Login successful");
						while (true) {
							System.out.println("press 1 to view products available");
							System.out.println("press 2 to view orders");
							System.out.println("press 3 to view contracts");
							System.out.println("press 4 to schedule product");
							System.out.println("press 5 to delete account");
							System.out.println("press 6 to update password");
							System.out.println("press 7 to go back");
							String choice = sc.nextLine();
							switch (Validations.isNumber2(choice)) {
							case 1:
								if (productServices.getAllProducts() != null && !productServices.getAllProducts().isEmpty()) {
									System.out.println(productServices.getAllProducts());
								} else {
									System.out.println("Products are not available");
								}
								break;
							case 2:
								if (customerServices.getAllCustomer() != null && !customerServices.getAllCustomer().isEmpty()) {
									System.out.println(customerServices.getAllCustomer());
								} else {
									System.out.println("No orders present");
								}
								break;
							case 3:
								if (contractServices.getAllContractors() != null && !contractServices.getAllContractors().isEmpty()) {
									System.out.println(contractServices.getAllContractors());
								} else {
									System.out.println("No contracts present");
								}
								break;
							case 4:
								 while(true) {
									 System.out.println("press 1 to deliver the product");
									 System.out.println("press 2 to delay the product if product not exists");
									 System.out.println("press 3 to go back");
									 System.out.println("press 4 to go home");
									 choice=sc.nextLine();
									switch(Validations.isNumber2(choice)) {
									case 1:System.out.println("Product delivered");
									break;
									case 2:System.out.println("product may be delayed");
									break;
									case 3:Scheduler.main();
									break;
									case 4:Application.main(null);
									break;
									default:System.out.println("Invalid choice");
									break;
										}
								 }
							case 5:
								flag = true;
								while(flag==true) {
								System.out.println("Enter username");
								String username=sc.nextLine();
								if(Validations.isName(username)) {
									usersBean.setUserName(username);
									flag=false;
								}else {
									System.err.println("Invalid username");
								}
							}
								flag = true;
								while (flag == true) {
									System.out.println("Enter password");
									String s = sc.nextLine();
									int strength = Validations.calculatePasswordStrength(s);
									if (strength == 10) {
										flag = false;
										usersBean.setPassword(s);
									} else {
										System.err.println(
												"The password is weak(Enter the password that should contain atleast 8 digits)"
														+ "It must include uppercase,lowercase,speacial character and integers");
									}
								}
								try {
									if (schedulerService.delete(usersBean.getUserName(), usersBean.getPassword())) {
										System.out.println("Deleted succesfully");
										Application.main(null);
									}
								} catch (UsersException e) {
									System.out.println(e.getMsg());
								}
								break;
							case 6:
								flag = true;
								while(flag==true) {
								System.out.println("Enter username");
								String username=sc.nextLine();
								if(Validations.isName(username)) {
									usersBean.setUserName(username);
									flag=false;
								}else {
									System.err.println("Invalid username");
								}
							}
								flag = true;
								while (flag == true) {
									System.out.println("Enter password");
									String password = sc.nextLine();
									int strength = Validations.calculatePasswordStrength(password);
									if (strength == 10) {
										flag = false;
										usersBean.setPassword(password);
									} else {
										System.err.println(
												"The password is weak(Enter the password that should contain atleast 8 digits)"
														+ "It must include uppercase,lowercase,speacial character and integers");
									}
								}
								try {
									if (schedulerService.update(usersBean.getUserName(), usersBean.getPassword())) {
										System.out.println("updated succesfully");
									}
								} catch (UsersException e) {
									System.out.println(e.getMsg());
								}
								break;
							case 7:
								Scheduler.main();
								break;
							}
						}
					}
				} catch (UsersException e) {
					System.err.println("Invalid Credintials");
				}
				break;
			case 2:
				usersBean.setRole("Scheduler");
				flag = true;
				while(flag==true) {
				System.out.println("Enter username");
				String username=sc.nextLine();
				if(Validations.isName(username)) {
					usersBean.setUserName(username);
					flag=false;
				}else {
					System.err.println("Invalid username");
				}
			}
				 flag = true;
				while (flag == true) {
					System.out.println("Enter password");
					String password = sc.nextLine();
					int strength = Validations.calculatePasswordStrength(password);
					if (strength == 10) {
						flag = false;
						usersBean.setPassword(password);
					} else {
						System.err
								.println("The password is weak(Enter the password that should contain atleast 7 digits)"
										+ "It must include uppercase,lowercase,speacial character and integers");
					}
				}
				flag = true;
				while (flag == true) {
					System.out.println("Enter email");
					String email = sc.nextLine();
					if (Validations.isValid(email)) {
						usersBean.setEmail(email);
						flag = false;
					} else
						System.err.println("Invalid format");
				}
				try {
					if (services.signup(usersBean)) {
						System.out.println("Registered successfully");
					}
				} catch (UsersException e) {
					System.err.println(e.getMsg());
				}

				break;
			case 3:
				return;
			default:
				System.err.println("Invalid choice");
				break;

			}
		}

	}

}
