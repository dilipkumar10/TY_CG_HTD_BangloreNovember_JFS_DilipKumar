package com.capgemini.phonesimulatorapplicationdevelopment.controller;

import java.util.Scanner;

import com.capgemini.phonesimulatorapplicationdevelopment.bean.ContactBean;
import com.capgemini.phonesimulatorapplicationdevelopment.factory.Factory;
import com.capgemini.phonesimulatorapplicationdevelopment.services.ContactServices;

public class Search {
	public static void search1() {
Scanner sc=new Scanner(System.in);
ContactBean bean1=Factory.beanObject();
ContactServices s=Factory.contactServiceObject();
System.out.println("Enter the name");
bean1.setName(sc.next());
if(s.search(bean1.getName())) {
	System.out.println("what you want to do?");
}else
	System.out.println("Contact not found");

while(true) {
	System.out.println("press 1 to call");
	System.out.println("press 2 to message");
	System.out.println("press 3 to go back");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:System.out.println("Calling");
		break;
	case 2:System.out.println("sending the message");
	break;
	case 3:return;
	default:System.out.println("Invalid choice");
	break;
	}
}
}
}
