package com.capgemini.phonesimulatorapplicationdevelopment.controller;

import java.util.Scanner;

import com.capgemini.phonesimulatorapplicationdevelopment.factory.Factory;
import com.capgemini.phonesimulatorapplicationdevelopment.services.ContactServices;

public class Contact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactServices s=Factory.contactServiceObject();
		while (true) {
			System.out.println("press 1 to show all contacts");
			System.out.println("Press 2 to search for contact");
			System.out.println("press 3 to operate on contact");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println(s.getAllContacts());
				break;
			case 2:Search.search1();
				break;
			case 3:Operation.operate();
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
