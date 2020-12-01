package com.address;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBookMethods addressMethod = new AddressBookMethods();
		while (true) {
			System.out.println("Press 1 : Add Contact");
			System.out.println("Press 2 : Edit Contact");
			System.out.println("Press 3 : Print Contact");
			System.out.println("Press 4 : Delete Contact");
			System.out.println("Press 0 : Exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addressMethod.add();
				break;
			case 2:
				addressMethod.edit();
				break;
			case 3:
				addressMethod.show();
				break;
			case 4:
				addressMethod.delete();
				break;
			case 0:
				return;
			default:
				System.out.println("Please Enter Correct Option");
			}
		}

	}
}
