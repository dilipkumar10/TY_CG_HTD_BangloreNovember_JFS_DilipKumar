package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import com.capgemini.forestrymanagementsystem.bean.ContractBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.ContractorBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.ProductBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.Validations;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.ContractException;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.CustomerExceptions;
import com.capgemini.forestrymanagementsystemjdbc.exceptions.ProductException;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;
import com.capgemini.forestrymanagementsystemjdbc.services.ContractServicesImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.ContractorServices;
import com.capgemini.forestrymanagementsystemjdbc.services.CustomerServices;
import com.capgemini.forestrymanagementsystemjdbc.services.ProductServices;

public class Contractor {
	public static void main() {
		ContractorServices contractServices = Factory.contractorServices();
		ProductServices productServices=Factory.productServices();
		CustomerServices customerServices=Factory.customerServices();
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (true) {
			System.out.println("press 1 for adding contracrtor");
			System.out.println("press 2 for deleting contractor");
			System.out.println("press 3 to getAllContractors");
			System.out.println("press 4 to go back");
			System.out.println("Enter your choice");
			String input = scanner.nextLine();
			switch (Validations.isNumber2(input)) {
			case 1:status = true;
				ContractorBean contractBean = new ContractorBean();
				while (status == true) {
					System.out.println("Enter Contract number");
					String contractNumber = scanner.nextLine();
					if (Validations.isNumber(contractNumber)) {
						int s1 = Integer.parseInt(contractNumber);
						contractBean.setContractNo(s1);
						status = false;
					} else
						System.err.println("Invalid format");
				}
				status = true;
				while (status == true) {
					System.out.println("Enter customerId ");
					String input1 = scanner.nextLine();
					if (Validations.isNumber(input1)) {
						int customerId = Integer.parseInt(input1);
						try {
						if(customerServices.search(customerId)!=null) {
						contractBean.setCustomerId(customerId);
						}
						}catch(CustomerExceptions e) {
							System.err.println(e.getMsg());
							Contractor.main();
						}
						status = false;
					} else
						System.err.println("Invalid format");
				}
				status = true;
				while (status == true) {
					System.out.println("Enter productId ");
					String input1 = scanner.nextLine();
					if (Validations.isNumber(input1)) {
						int productId = Integer.parseInt(input1);
						try {
						if(productServices.searchProduct(productId)!=null) {
						contractBean.setProductId(productId);
						status = false;
						}
						}catch(ProductException e) {
							System.err.println(e.getMsg());
							Contractor.main();
						}
					} else
						System.err.println("Invalid format");
				}
				status = true;
				while (status == true) {
					System.out.println("Enter Delivery date(dd/mm/yyyy)");
					String input1 = scanner.nextLine();
					if (!Validations.isValidDate1(input1)) {
						contractBean.setDeliveryDate(input1);
						status = false;
					} else
						System.err.println("Invalid format");
				}
				status=true;
				while (status == true) {
					System.out.println("Enter quantity ");
					String input1 = scanner.nextLine();
					if (Validations.isNumber1(input1)) {
						int customerid = Integer.parseInt(input1);
						contractBean.setQuantity(customerid);
						status = false;
					} else
						System.err.println("Invalid format");
				}
				try {
				if (contractServices.addContractor(contractBean)) {
					System.out.println("Contractor added succesfully");
					
				} 
				}catch(ContractException e) {
					System.out.println(e.getMsg());
				}
				break;
			case 2:
				status = true;
				ContractorBean contractBean1 = new ContractorBean();
				while (status == true) {
					System.out.println("Enter contractNo you want to delete");
					String str = scanner.nextLine();
					if (Validations.isNumber(str)) {
						int contractNo = Integer.parseInt(str);
						contractBean1.setContractNo(contractNo);
						status = false;
					} else
						System.err.println("Invalid format");
				}
				try {
				if (contractServices.deleteContractorBean(contractBean1.getCustomerId())) {
					System.out.println("Deleted succefully");
				} 
				}catch(ContractException e) {
					System.err.println(e.getMsg());
				}
				break;
			case 3:if(contractServices.getAllContractors()!=null && !contractServices.getAllContractors().isEmpty()) {
				System.out.println(contractServices.getAllContractors());
			}else {
				System.out.println("No contracts present");
			}
				break;
			case 4:
				return;

			default:
				System.err.println("Invalid choice");
			}
		}
	}

	
}
