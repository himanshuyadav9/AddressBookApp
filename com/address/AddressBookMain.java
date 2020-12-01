package com.address;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1: Search Name By city");
			System.out.println("Press 2: Search Name By state");
			System.out.println("Press 3: Search all contacts in city");
			System.out.println("Press 4: Search all contacts in state");
			System.out.println("Press 0: Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter city for search");
				String city = scanner.next();
				System.out.println("Enter first name");
				String firstName = scanner.next();
				System.out.println("Enter last name");
				String lastName = scanner.next();
				SearchPersonINCity(addressbookMap, city, firstName, lastName);
				break;
			case 2:
				System.out.println("Enter state for search");
				String state = scanner.next();
				System.out.println("Enter first name");
				String FirstName = scanner.next();
				System.out.println("Enter last name");
				String LastName = scanner.next();
				SearchPersonInState(addressbookMap, state, FirstName, LastName);
				break;
			case 3:
				System.out.println("Enter city for search");
				String City = scanner.next();
				SearchINCity(addressbookMap, City);
				break;
			case 4:
				System.out.println("Enter city for search");
				String State = scanner.next();
				SearchINState(addressbookMap, State);
				break;
			case 0:
				return;
			default:
				System.out.println("Please Enter Correct choise ");
			}
		}
	}

	static void SearchPersonINCity(Map<String, AddressBookMethods> addressbookMap, String city, String firstName,
			String lastName) {
		for (AddressBookMethods iterator : addressbookMap.values()) {
			Set<PersonalInformation> addressBooks = iterator.addressBook;
			addressBooks.stream().forEach(addressBook -> {
				if (addressBook.getcity().equalsIgnoreCase(city))
					if (addressBook.getfirstName().equalsIgnoreCase(firstName))
						if (addressBook.getlastName().equalsIgnoreCase(lastName))
							System.out.println(addressBook.getfirstName() + " " + addressBook.getlastName());

			});

		}
	}

	static void SearchPersonInState(Map<String, AddressBookMethods> addressbookMap, String state, String firstName,
			String lastName) {
		for (AddressBookMethods iterator : addressbookMap.values()) {
			Set<PersonalInformation> addressBooks = iterator.addressBook;
			addressBooks.stream().forEach(addressBook -> {
				if (addressBook.getstate().equalsIgnoreCase(state))
					if (addressBook.getfirstName().equalsIgnoreCase(firstName))
						if (addressBook.getlastName().equalsIgnoreCase(lastName))
							System.out.println(addressBook.getfirstName() + " " + addressBook.getlastName());
			});

		}
	}

	static void SearchINCity(Map<String, AddressBookMethods> addressbookMap, String city) {
		for (AddressBookMethods iterator : addressbookMap.values()) {
			Set<PersonalInformation> addressBooks = iterator.addressBook;
			addressBooks.stream().forEach(addressBook -> {
				if (addressBook.getcity().equalsIgnoreCase(city))
					System.out.println(addressBook.getfirstName() + " " + addressBook.getlastName());

			});

		}
	}
	
	static void SearchINState(Map<String, AddressBookMethods> addressbookMap, String state) {
		for (AddressBookMethods iterator : addressbookMap.values()) {
			Set<PersonalInformation> addressBooks = iterator.addressBook;
			addressBooks.stream().forEach(addressBook -> {
				if (addressBook.getstate().equalsIgnoreCase(state))
					System.out.println(addressBook.getfirstName() + " " + addressBook.getlastName());

			});

		}
	}
}

