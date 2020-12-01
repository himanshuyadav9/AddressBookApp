package com.address;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
	void address_Book(AddressBookMethods addressMethod) {
		while (true) {
			System.out.println("Press 1 : Add Contact");
			System.out.println("Press 2 : Edit Contact");
			System.out.println("Press 3 : Print Contact");
			System.out.println("Press 4 : Delete Contact");
			System.out.println("Press 0 : Exit");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
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

	public static void main(String[] args) {
		System.out.println("Welcome to Address book");
		Map<String, AddressBookMethods> addressbookMap = new HashMap<String, AddressBookMethods>();
		String name;
		while (true) {

			System.out.println("Enter the Address book name");
			Scanner scanner = new Scanner(System.in);
			name = scanner.nextLine();
			AddressBookMethods addressMethods = addressbookMap.get(name);
			if (addressMethods == null) {
				addressMethods = new AddressBookMethods();
				addressbookMap.put(name, addressMethods);
			}

			AddressBookMain book = new AddressBookMain();
			book.address_Book(addressMethods);
			System.out.println("Press 1 : Want to enter in other addressbook");
			System.out.println("Press any other key to exit");
			String choise = scanner.nextLine();
			if (!choise.equals("1"))
				break;
		}
	}
}
