package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.capgemini.forestrymanagementsystemjdbc.bean.ContractorBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.Validations;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.CustomerExceptions;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;
import com.capgemini.forestrymanagementsystemjdbc.services.CustomerServices;

public class Customer {
	static CustomerBean bean = Factory.getCustBean();

	public static void main() {
		Scanner sc = new Scanner(System.in);
		CustomerServices customerService = Factory.customerServices();
		boolean check = true;
		
		while (true) {
			System.out.println("press 1 for adding customer");
			System.out.println("press 2 for deleting customer");
			System.out.println("press 3 to get all customer");
			System.out.println("press 4 for updating");
			System.out.println("press 5 to go back");
			System.out.println("Enter choice");
			String input = sc.nextLine();
			switch (Validations.isNumber2(input)) {
			case 1:
				while (check == true) {
					System.out.println("Enter customerId ");
					String input1 = sc.nextLine();
					if (Validations.isNumber(input1)) {
						int customerid = Integer.parseInt(input1);
						bean.setCustomerId(customerid);
						check = false;
					} else
						System.err.println("Invalid format");
				}
				check = true;
				while (check == true) {
					System.out.println("Enter customerName");
					String input1 = sc.nextLine();
					if (Validations.isName(input1)) {
						bean.setCustomerName(input1);
						check = false;
					} else
						System.err.println("Invalid Format");
				}
				System.out.println("Enter streetaddress1");
				String address1 = sc.nextLine();
				bean.setStreetAddress1(address1);
				System.out.println("Enter streetaddress2");
				String address2 = sc.nextLine();
				bean.setStreetAddress2(address2);
				check = true;
				while (check == true) {
					System.out.println("Enter town");
					String town = sc.nextLine();
					if (Validations.isStringOnly(town)) {
						bean.setTown(town);
						check = false;
					}else
						System.err.println("Invlaid format");
				}
				check = true;
				while (check == true) {
					System.out.println("Enter postal code");
					String postalCode = sc.nextLine();
					if (Validations.isNumber(postalCode) && postalCode.length()==6) {
						long postCode = Long.parseLong(postalCode);
						bean.setPostalCode(postCode);
						check = false;
					} else
						System.err.println("Ivalid format");
				}
				check = true;
				while (check == true) {
					System.out.println("Enter email");
					String email = sc.nextLine();
					if (Validations.isValid(email)) {
						bean.setEmail(email);
						check = false;
					} else
						System.err.println("Invalid format");
				}
				check = true;
				while (check == true) {
					System.out.println("Enter tel num");
					String telephoneNumber = sc.nextLine();
					if (Validations.isValidTel(telephoneNumber)) {
						long longTelphoneNumber = Long.parseLong(telephoneNumber);
						bean.setTelePhoneNum(longTelphoneNumber);
						check = false;
					} else
						System.err.println("Invalid format");
				}
				try {
				if (customerService.addCustomer(bean)) {
					System.out.println("Added successfully");
				} 
				}catch(CustomerExceptions e) {
					System.err.println(e.getMsg());
				}
				break;

			case 2:
				check = true;
				while (check == true) {
					System.out.println("enter the customer id you want to delete");
					String input1 = sc.nextLine();
					if (Validations.isNumber(input1)) {
						int customerId = Integer.parseInt(input1);
						bean.setCustomerId(customerId);
						check = false;
						try {
						if (customerService.deleteCustomer(bean.getCustomerId())) {
							System.out.println("deleted successfully");
						}
						}catch(CustomerExceptions e) {
							System.err.println("Id does not exists");
						}
					} else
						System.out.println("Invalid formaat");
				}
				break;
				
			case 3:
				if(customerService.getAllCustomer()!=null && !customerService.getAllCustomer().isEmpty()) {
				System.out.println(customerService.getAllCustomer());
				}else {
					System.out.println("No customers present");
				}
				break;
			case 4:check=true;
				
				int coustomerNumber = 0;
				while (check == true) {

					System.out.println("Enter the Customer ID");
					String customerId = sc.nextLine();
					if (Validations.isNumber(customerId)) {
						coustomerNumber = Integer.parseInt(customerId);
						check = false;
					} else {
						System.err.println("Plz enter the customer id");
					}
				}
				check = true;
				
				System.out.println("1.name");
				System.out.println("2.StreetAddress1");
				System.out.println("3.StreetAddress2");
				System.out.println("4.Town");
				System.out.println("5.Postalcode");
				System.out.println("6.email");
				System.out.println("7 telphone");
				System.out.println("enter the choice");
				String choice1 = sc.nextLine();
				switch (Validations.isNumber2(choice1)) {
				case 1:
					check = true;
					while (check == true) {
						System.out.println("Enter the name");
						String customerName = sc.nextLine();
						if (Validations.isStringOnly(customerName)) {
							try {
							if (customerService.modify(coustomerNumber, customerName)) {
								check = false;
								System.out.println("name is modified");
							} 
							}catch(CustomerExceptions e) {
								System.err.println(e.getMsg());
							}
						} else {
							System.err.println("invlaid format");
						}
					}
					check = true;
					break;
				case 2:
					System.out.println("Enter the address 1");
					String streetAddress1 = sc.nextLine();
					try {
						if (customerService.modifyAdd1(coustomerNumber, streetAddress1)) {
							System.out.println("address1 is modofied");
						}
						}catch(CustomerExceptions e) {
							System.err.println(e.getMsg());
						}
					break;
				case 3:
					System.out.println("Enter the address 1");
					String streetAddress2 = sc.nextLine();
					try {
						if (customerService.modifyAdd1(coustomerNumber, streetAddress2)) {
							System.out.println("address2 is modofied");
						}
						}catch(CustomerExceptions e) {
							System.err.println(e.getMsg());
						}
					break;
				case 4:
					check = true;
					while (check == true) {
						System.out.println("Enter the town");
						String town = sc.nextLine();
						if (Validations.isStringOnly(town)) {
							check = false;
							try {
							if (customerService.modifyTown(coustomerNumber, town)) {
								System.out.println("town is modofied");
							} 
							}catch(CustomerExceptions e) {
								System.err.println(e.getMsg());
							}

						} else {
							System.err.println("invlaid format");
						}
					}
					check = true;
					break;
				case 5:
					check = true;
					while (check == true) {
						System.out.println("Enter the Postal code");
						String postalString = sc.nextLine();
						if (Validations.isNumber(postalString) && postalString.length()==6) {
							int postalNumber = Integer.parseInt(postalString);
							try {
							if (customerService.modifyCode(coustomerNumber, postalNumber)) {
								System.out.println("sucessfully");
							} 
							}catch(CustomerExceptions e) {
								System.err.println(e.getMsg());
							}
							check = false;
						} else {
							System.err.println("Plz enter the customer id");
						}
					}
					check = true;
					break;
				case 6:
					check = true;
					while (check == true) {
						System.out.println("Enter the email");
						String email = sc.nextLine();
						if (Validations.isValid(email)) {
							try {
							if (customerService.modifyEmail(coustomerNumber, email)) {
								System.out.println("sucessfully");
							} 
							}catch(CustomerExceptions e) {
								System.err.println(e.getMsg());
							}
							check = false;
						} else {
							System.err.println("invlaid format");
						}
					}
					check = true;
					break;
				case 7:
					check = true;
					while (check == true) {
						System.out.println("Enter the Telephone");
						String telephoneString = sc.nextLine();
						if (Validations.isValidTel(telephoneString)) {
							int telephoneNumber = Integer.parseInt(telephoneString);
							try {
							if (customerService.modifyTelphone(coustomerNumber, telephoneNumber)) {
								System.out.println("sucessfully");
							} 
							}catch(CustomerExceptions e) {
								System.err.println(e.getMsg());
							}
							check = false;
						} else {
							System.err.println("Enter valid telephone number");
						}
					}
					check = true;
					break;
				default:
					System.err.println("invalid");
				}
				break;
			case 5:return;
			default:
				System.err.println("invalid");

			}
			check = true;
			
		}
	}

	

	

}

