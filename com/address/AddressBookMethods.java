package com.address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class AddressBookMethods {
	// ArrayList<Address> addressBook = new ArrayList<Address>();
		Set<PersonalInformation> addressBook = new LinkedHashSet<PersonalInformation>();

		void add() {
			
			boolean flag=true;
			PersonalInformation info = new PersonalInformation();
			for (PersonalInformation iterator : addressBook) {
				if (iterator.getfirstName().equalsIgnoreCase(info.getfirstName()))
					flag=false;
			}
			if(flag)
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
			System.out.println("Enter the new Address Name");
			String newAddresss = scanner.next();
			for (PersonalInformation iterator : addressBook) {
				if (iterator.getfirstName().equalsIgnoreCase(name))
					iterator.setaddress(newAddresss);
			}
			break;
		case 2:
			System.out.println("Enter the new City");
			String newCity = scanner.next();
			for (PersonalInformation iterator : addressBook) {
				if (iterator.getfirstName().equalsIgnoreCase(name))
					iterator.setcity(newCity);
			}
			break;
		case 3:
			System.out.println("Enter the new State");
			String newState = scanner.next();
			for (PersonalInformation iterator : addressBook) {
				if (iterator.getfirstName().equalsIgnoreCase(name))
					iterator.setstate(newState);
			}
			break;
		case 4:
			System.out.println("Enter the new Zip");
			String newZip = scanner.next();
			for (PersonalInformation iterator : addressBook) {
				if (iterator.getfirstName().equalsIgnoreCase(name))
					iterator.setzip(newZip);
			}
			break;
		case 5:
			System.out.println("Enter the new Phone Number");
			String newPhoneNumber = scanner.next();
			for (PersonalInformation iterator : addressBook) {
				if (iterator.getfirstName().equalsIgnoreCase(name))
					iterator.setphoneNumber(newPhoneNumber);
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
		for (PersonalInformation iterator : addressBook) {
			if (iterator.getfirstName().equalsIgnoreCase(name)) {
				addressBook.remove(iterator);
				System.out.println("Name deleted");
			}
			else
			{
				System.out.println("given name is not available in addressbook");
			}
		}
	}
}
