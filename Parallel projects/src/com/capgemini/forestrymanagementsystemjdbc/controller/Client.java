package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.Validations;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.UsersException;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;
import com.capgemini.forestrymanagementsystemjdbc.services.ClientServices;
import com.capgemini.forestrymanagementsystemjdbc.services.LandServices;
import com.capgemini.forestrymanagementsystemjdbc.services.ProductServices;

public class Client {
	static ClientServices clientServices = Factory.clientServices();
	static ProductServices productServices = Factory.productServices();
	static LandServices landServices = Factory.landServices();
	static UsersBean usersBean = new UsersBean();

	public static void m1() {
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (true) {
			System.out.println("press 1 for login");
			System.out.println("press 2 for signup");
			System.out.println("press 3 to go back");
			String choice = scanner.nextLine();
			switch (Validations.isNumber2(choice)) {
			case 1:
				while(status==true) {
				System.out.println("Enter username");
				String username=scanner.nextLine();
				if(Validations.isName(username)) {
					usersBean.setUserName(username);
					status=false;
				}else {
					System.err.println("Invalid username");
				}
			}
				status = true;
				while (status == true) {
					System.out.println("Enter password");
					String s = scanner.nextLine();
					int strength = Validations.calculatePasswordStrength(s);
					if (strength == 10) {
						status = false;
						usersBean.setPassword(s);
					} else {
						System.err.println(
								"The password is wrong(Hint-Enter the password that should contain atleast 8 digits)"
										+ "It must include uppercase,lowercase,speacial character and integers");
					}
				}
				try {
				if (clientServices.login(usersBean.getUserName(), usersBean.getPassword())) {
					System.out.println("Login successful");
					while (true) {
						System.out.println("press 1 to view land details");
						System.out.println("press 2 to view products available");
						System.out.println("press 3 for contract operations");
						System.out.println("press 4 for customer operations");
						System.out.println("press 5 for deleting account");
						System.out.println("press 6 for updating password");
						System.out.println("press 7 to go back");
						System.out.println("press 8 to go home");
						String choice1 = scanner.nextLine();
						switch (Validations.isNumber2(choice1)) {
						case 1:
							if (landServices.getAllLands() != null && !landServices.getAllLands().isEmpty()) {
								System.out.println(landServices.getAllLands());
							} else {
								System.out.println("Forest manager is no willing to show the land details");
							}
							break;
						case 2:
							if (productServices.getAllProducts() != null && !productServices.getAllProducts().isEmpty()) {
								System.out.println(productServices.getAllProducts());
							} else {
								System.out.println("products are not available");
							}

							break;
						case 3:
							Contractor.main();
							break;
						case 4:
							Customer.main();
							break;
						
						case 5:
							status = true;
							while(status==true) {
							System.out.println("Enter username");
							String username=scanner.nextLine();
							if(Validations.isName(username)) {
								usersBean.setUserName(username);
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
									usersBean.setPassword(password);
								} else {
									System.err.println(
											"The password is weak(Enter the password that should contain atleast 8 digits)"
													+ "It must include uppercase,lowercase,speacial character and integers");
								}
							}
							try {
							if (clientServices.delete(usersBean.getUserName(), usersBean.getPassword())) {
								System.out.println("Deleted succesfully");
								Application.main(null);
							} 
							}catch(UsersException e) {
								System.err.println(e.getMsg());
							}
							break;
						case 6:
							status = true;
							while(status==true) {
							System.out.println("Enter username");
							String username=scanner.nextLine();
							if(Validations.isName(username)) {
								usersBean.setUserName(username);
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
									usersBean.setPassword(password);
								} else {
									System.err.println(
											"The password is weak(Enter the password that should contain atleast 8 digits)"
													+ "It must include uppercase,lowercase,speacial character and integers");
								}
							}
							try {
							if (clientServices.update(usersBean.getUserName(), usersBean.getPassword())) {
								System.out.println("updated succesfully");
							} 
							}catch(UsersException e) {
								System.out.println(e.getMsg());
							}
							break;
						case 7:
							return;
						case 8:
							Application.main(null);
							break;
						default:
							System.err.println("Invalid choice");
							break;
						}
					}
				} 
				}catch(UsersException e) {
					System.err.println(e.getMsg());
				}
				break;
			case 2:
				usersBean.setRole("Client");
				status=true;
				while(status==true) {
				System.out.println("Enter username");
				String username=scanner.nextLine();
				if(Validations.isName(username)) {
					usersBean.setUserName(username);
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
						usersBean.setPassword(password);
					} else {
						System.err
								.println("The password is weak(Enter the password that should contain atleast 8 digits)"
										+ "It must include uppercase,lowercase,speacial character and integers");
					}
				}
				status = true;
				while (status == true) {
					System.out.println("Enter email");
					String email = scanner.nextLine();
					if (Validations.isValid(email)) {
						usersBean.setEmail(email);
						status = false;
					} else
						System.err.println("Invalid email");
				}
				try {
				if (clientServices.addClient(usersBean)) {
					System.out.println("Registered successful");
					status=true;
				}
				}catch(UsersException e) {
					System.err.println(e.getMsg());
				}
				break;
			case 3:
				return;

			}
		}
	}
}
