package com.address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookMethods {
	ArrayList<PersonalInformation> addressBook = new ArrayList<PersonalInformation>();

	void add() {
		PersonalInformation info = new PersonalInformation();
		 addressBook.add(info);
	}
	void show() {
		Iterator itr = addressBook.iterator();
		while (itr.hasNext()) {
			PersonalInformation address = (PersonalInformation) itr.next();
			System.out.println("Name- " + address.getfirstName() + " " + address.getlastName());
			System.out.println("Address- " + address.getaddress());
			System.out.println(
					"City- " + address.getcity() + "  State-  " + address.getstate() + "  Zip-  " + address.getzip());
			System.out.println("Phone Number- " + address.getphoneNumber());
		}
	}

	void edit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name whose deatils need to change  ");
		String name = scanner.nextLine();
		System.out.println("Enter the detail you want to edit");
		while (true) {
			System.out.println("Press 1 : Address");
			System.out.println("Press 2 : City");
			System.out.println("Press 3 : State");
			System.out.println("Press 4 : Zip");
			System.out.println("Press 5 : Phone Number");
			System.out.println("Press 6 : Email");
			System.out.println("Press 0 : Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the new Address ");
				String newAddress = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getfirstName().equalsIgnoreCase(name)) {
						PersonalInformation address = addressBook.get(i);
						address.setaddress(newAddress);
					}
				}
				break;
			case 2:
				System.out.println("Enter the new City");
				String newCity = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getfirstName().equalsIgnoreCase(name)) {
						PersonalInformation address = addressBook.get(i);
						address.setcity(newCity);
					}
				}
				break;
			case 3:
				System.out.println("Enter the new State");
				String newState = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getfirstName().equalsIgnoreCase(name)) {
						PersonalInformation address = addressBook.get(i);
						address.setstate(newState);
					}
				}
				break;
			case 4:
				System.out.println("Enter the new Zip");
				String newZip = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getfirstName().equalsIgnoreCase(name)) {
						PersonalInformation address = addressBook.get(i);
						address.setzip(newZip);
					}
				}
				break;
			case 5:
				System.out.println("Enter the new Phone Number");
				String newPhoneNumber = scanner.next();
				for (int i = 0; i < addressBook.size(); i++) {
					if (addressBook.get(i).getfirstName().equalsIgnoreCase(name)) {
						PersonalInformation address = addressBook.get(i);
						address.setphoneNumber(newPhoneNumber);
					}
				}
				break;
			case 0:
				return;
			default:
				System.out.println("Please Enter Correct Option");
			}
		}
	}
	void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name whose data to delete");
		String name = scanner.next();
		for (int i = 0; i < addressBook.size(); i++) {
			if (addressBook.get(i).getfirstName().equalsIgnoreCase(name)) {
				addressBook.remove(i);
			}
		}
	}
}
