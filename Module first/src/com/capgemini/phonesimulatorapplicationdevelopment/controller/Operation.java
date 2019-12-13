package com.capgemini.phonesimulatorapplicationdevelopment.controller;

import java.util.Scanner;

import com.capgemini.phonesimulatorapplicationdevelopment.bean.ContactBean;
import com.capgemini.phonesimulatorapplicationdevelopment.factory.Factory;
import com.capgemini.phonesimulatorapplicationdevelopment.services.ContactServices;

public class Operation {
public static void operate() {
	ContactServices s=Factory.contactServiceObject();
	ContactBean bean=Factory.beanObject();
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("press 1 for adding contact");
		System.out.println("press 2 for delete contact");
		System.out.println("press 3 for editing contact");
		System.out.println("press 4 to go back");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Enter name");
			bean.setName(sc.next());
			System.out.println("Enter number");
			bean.setNumber(sc.nextLong());
			if(s.add(bean)) {
				System.out.println("Added successfully");
			}else
				System.out.println("Something went wrong");
			break;
		case 2:System.out.println("Enter name");
		bean.setName(sc.next());
		if(s.delete(bean.getName())) {
			System.out.println("Deleted successfully");
		}
		else
			System.out.println("something went wrong");
			break;
		case 3:System.out.println("Enter the name you want to edit");
		bean.setName(sc.next());
		System.out.println("Enter the new number");
		bean.setNumber(sc.nextLong());
		if(s.edit(bean.getName(),bean.getNumber())) {
			System.out.println("updated successfully");
		}else
			System.out.println("something went wrong");
			break;
		case 4:return;
		default:System.err.println("Invalid choice");
			break;
		}
	}
}
}
