package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.LandBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.Validations;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.LandException;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.UsersException;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;
import com.capgemini.forestrymanagementsystemjdbc.services.ClientServices;
import com.capgemini.forestrymanagementsystemjdbc.services.AdminServices;
import com.capgemini.forestrymanagementsystemjdbc.services.LandServices;

public class Admin {
	public static LandBean landBean = Factory.landMethod();
	public static LandServices landServices = Factory.landServices();
	public static UsersBean usersBean = new UsersBean();
	public static AdminServices adminServices = Factory.adminServiceMethod();

	public static void land() {
		LandServices landServices = Factory.landServices();
		boolean status = true;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("press 1 for adding land details");
			System.out.println("press 2 for deleting land details");
			System.out.println("press 3 for updating land details");
			System.out.println("press 4 to get all land details");
			System.out.println("press 5 for product operations");
			System.out.println("press 6 to delete account");
			System.out.println("press 7 to update account");
			System.out.println("press 8 to go back");
			System.out.println("press 9 to go home");
			String choice = scanner.nextLine();
			switch (Validations.isNumber2(choice)) {
			case 1:
				LandBean landBean1 = new LandBean();
				status = true;
				while (status == true) {
					System.out.println("Enter the landId");
					String s = scanner.nextLine();
					if (Validations.isNumber(s)) {
						int s1 = Integer.parseInt(s);
						landBean1.setLandId(s1);
						status = false;
					} else
						System.err.println("Invalid format");
				}
				status = true;
				while (status == true) {
					System.out.println("Enter the land owner name");
					String name = scanner.nextLine();
					if (Validations.isStringOnly(name)) {
						landBean1.setLandOwner(name);
						status = false;
					} else
						System.err.println("Invalid Format");
				}
				status = true;
				while (status == true) {
					System.out.println("Enter the land size");
					String s = scanner.nextLine();
					if (Validations.isNumber(s)) {
						int size = Integer.parseInt(s);
						landBean1.setLandSize(size);
						status = false;
					} else
						System.err.println("Invalid format");
				}
				status = true;
				while (status == true) {
					System.out.println("Enter the product grown in that land");
					String product = scanner.nextLine();
					if (Validations.isStringOnly(product)) {
						landBean1.setProduct(product);
						status = false;
					} else
						System.err.println("Invalid Format");
				}
				try {
					if (landServices.add(landBean1)) {
						System.out.println("Land details added successfully");
					}
				} catch (LandException e) {
					System.out.println(e.getMsg());
				}
				break;
			case 2:
				status = true;
				while (status == true) {
					System.out.println("Enter the landId you want to delete");
					String input = scanner.nextLine();
					if (Validations.isNumber(input)) {
						int s1 = Integer.parseInt(input);
						landBean.setLandId(s1);
						status = false;
					} else
						System.err.println("Invalid format");
				}
				try {
					if (landServices.delete(landBean.getLandId())) {
						System.out.println("Deleted successfully");
					}
				} catch (LandException e) {
					System.out.println(e.getMsg());
				}
				break;
			case 3:
				int id = 0;
				status = true;
				while (status == true) {
					System.out.println("Enter the landId");
					String input = scanner.nextLine();
					if (Validations.isNumber(input)) {
						id = Integer.parseInt(input);
						landBean.setLandId(id);
						status = false;
					} else
						System.err.println("Invalid format");
				}

				status = true;
				while (status == true) {
					System.out.println("what you want to update");
					System.out.println("press 1 to update land owner name");
					System.out.println("press 2 for updating product");
					System.out.println("press 3 for updating land size");
					System.out.println("press 4 to go back");
					String choice1 = scanner.nextLine();
					switch (Validations.isNumber2(choice1)) {
					case 1:
						status = true;
						while (status == true) {
							System.out.println("Enter the land owner name");
							String name = scanner.nextLine();
							if (Validations.isStringOnly(name)) {
								status = false;
								try {
									if (landServices.updateName(id, name)) {
										System.out.println("updated successfully");
									}
								} catch (LandException e) {
									System.out.println(e.getMsg());
								}
							} else
								System.err.println("Invalid Format");
						}

						break;
					case 2:
						status = true;
						while (status == true) {
							System.out.println("Enter the product grown in that land");
							String day = scanner.nextLine();
							if (Validations.isStringOnly(day)) {
								status = false;
								try {
									if (landServices.updateProduct(id, day)) {
										System.out.println("updated successfully");
									}
								} catch (Exception e) {
									System.out.println("something went wrong");
								}
							} else
								System.err.println("Invalid Format");
						}
						break;
					case 3:

						status = true;
						while (status == true) {
							System.out.println("Enter the land size");
							String input = scanner.nextLine();
							if (Validations.isNumber(input)) {
								int input1 = Integer.parseInt(input);
								try {
									if (landServices.updateSize(id, input1)) {
										System.out.println("updated successfully");
									}
								} catch (LandException e) {
									System.out.println(e.getMsg());
								}
								status = false;
							} else
								System.err.println("Invalid format");
						}

						break;
					case 4:
						Admin.land();
						break;

					default:
						System.err.println("invalid choice");
						break;
					}
				}
				break;
			case 4:
				List<LandBean> list = landServices.getAllLands();
				if (!list.isEmpty() && list != null) {
					System.out.println(landServices.getAllLands());
				} else {
					System.out.println("No lands present");
				}
				break;
			case 5:
				Product.main1();
				break;
			case 6:
				status = true;
				while (status == true) {
					System.out.println("Enter username");
					String username = scanner.nextLine();
					if (Validations.isName(username)) {
						usersBean.setUserName(username);
						status = false;
					} else {
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
								"The password is wrong(Hint-Enter the password that should contain atleast 8 digits)"
										+ "It must include uppercase,lowercase,speacial character and integers");
					}
				}
				try {
					if (adminServices.delete(usersBean.getUserName(), usersBean.getPassword())) {
						System.out.println("Deleted successfully");
						Application.main(null);
					}
				} catch (UsersException e) {
					System.out.println(e.getMsg());
				}

				break;
			case 7:
				status = true;
				while (status == true) {
					System.out.println("Enter username");
					String username = scanner.nextLine();
					if (Validations.isName(username)) {
						usersBean.setUserName(username);
						status = false;
					} else {
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
								"The password is wrong(Hint-Enter the password that should contain atleast 8 digits)"
										+ "It must include uppercase,lowercase,speacial character and integers");
					}
				}
				try {
					if (adminServices.update(usersBean.getUserName(), usersBean.getPassword())) {
						System.out.println("Updated successfully");
					}
				} catch (UsersException e) {
					System.out.println(e.getMsg());
				}
				break;
			case 8:
				return;
			case 9:
				Application.main(null);
				break;
			default:
				System.err.println("Invalid choice");
				break;
			}
		}
	}
}
