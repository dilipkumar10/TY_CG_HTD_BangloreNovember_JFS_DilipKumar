package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.ProductBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.Validations;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.ProductException;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;
import com.capgemini.forestrymanagementsystemjdbc.services.ProductServices;

public class Product {
	public static void main1() {
		Scanner scanner = new Scanner(System.in);
		ProductServices productServices = Factory.productServices();
		boolean status = true;
		while (true) {
			System.out.println("press 1 for adding product");
			System.out.println("press 2 for deleting product");
			System.out.println("press 3 for modifying product");
			System.out.println("press 4 to get all products");
			System.out.println("press 5 for contract operation");
			System.out.println("press 5 to go back");
			System.out.println("press 6 to go home");
			System.out.println("Enter the choice");
			String choice = scanner.nextLine();
			switch (Validations.isNumber2(choice)) {
			case 1:
				ProductBean bean = new ProductBean();
				status = true;
				while (status == true) {
					System.out.println("Enter productId ");
					String input = scanner.nextLine();
					if (Validations.isNumber(input)) {
						int productId = Integer.parseInt(input);
						bean.setProductId(productId);
						status = false;
					} else
						System.err.println("Invalid format");
				}
				status = true;
				while (status == true) {
					System.out.println("Enter productName you want to add");
					String input = scanner.nextLine();
					if (Validations.isStringOnly(input)) {
						bean.setProductName(input);
						status = false;

					} else
						System.err.println("Invalid format");
				}
				status = true;
				while (status == true) {
					System.out.println("Enter product Quantity available ");
					String input = scanner.nextLine();
					if (Validations.isNumber1(input)) {
						double quantity = Double.parseDouble(input);
						bean.setQuantity(quantity);
						status = false;
					} else
						System.err.println("Invalid format");
				}
				try {
					if (productServices.addProduct(bean)) {
						System.out.println("added successfully");
					}
				} catch (ProductException e) {
					System.err.println(e.getMsg());

				}

				break;
			case 2:
				status = true;
				ProductBean bean1 = new ProductBean();
				while (status == true) {
					System.out.println("Enter the id you want to delete");
					String input = scanner.nextLine();
					if (Validations.isNumber(input)) {
						int productId = Integer.parseInt(input);
						bean1.setProductId(productId);
						status = false;
						try {
							if (productServices.deleteProduct(bean1.getProductId())) {
								System.out.println("Deleted successfully");
							}
						} catch (ProductException e) {
							System.err.println(e.getMsg());
						}
					} else
						System.out.println("Invalid format");
				}
				break;
			case 3:
				status = true;
				ProductBean bean2 = new ProductBean();
				while (status == true) {
					System.out.println("Enter the ProductId you want to modify");
					String input = scanner.nextLine();
					if (Validations.isNumber(input)) {
						int productId = Integer.parseInt(input);
						bean2.setProductId(productId);
						status = false;
					} else
						System.err.println("Invalid format");
				}
				status = true;
				while (status == true) {
					System.out.println("press 1 to modify prod name");
					System.out.println("press 2 to modify quantity");
					System.out.println("press 3 to go back");
					int choice1 = scanner.nextInt();
					switch (choice1) {
					case 1:
						status = true;
						while (status == true) {
							System.out.println("Enter new productName you want to add");
							String input = scanner.nextLine();
							if (Validations.isStringOnly(input)) {
								bean2.setProductName(input);
								status = false;
								try {
									if (productServices.modifyProduct(bean2.getProductId(), bean2.getProductName())) {
										System.out.println("updated successfully");
									}
								} catch (ProductException e) {
									System.err.println(e.getMsg());
								}
							} else
								System.err.println("Invalid format");
						}
						break;
					case 2:
						status = true;
						while (status == true) {
							System.out.println("Enter product Quantity available");
							String input = scanner.nextLine();
							if (Validations.isNumber1(input)) {
								double quantity = Double.parseDouble(input);
								bean2.setQuantity(quantity);
								status = false;
								try {
									if (productServices.modifyprodquantity(bean2.getProductId(), bean2.getQuantity())) {
										System.out.println("updated successfully");
									}
								} catch (ProductException e) {
									System.err.println(e.getMsg());
								}
							} else
								System.err.println("Invalid format");
						}
						break;
					case 3:
						Product.main1();
						break;
					default:
						System.err.println("Invalid choice");
					}
				}
				break;
			case 4:
				if (productServices.getAllProducts() != null && !productServices.getAllProducts().isEmpty()) {
					System.out.println(productServices.getAllProducts());
				} else {
					System.out.println("No products are available");
				}
				break;
			case 5:
				return;
			case 6:
				Application.main(null);
			default:
				System.err.println("Invalid choice");
				break;

			}

		}
	}

}
