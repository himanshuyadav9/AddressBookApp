package com.address;

public class AddressBookMain {
    public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBookMethods addressMethod = new AddressBookMethods() ;
		addressMethod.add();
		addressMethod.show();
		addressMethod.edit();
		addressMethod.delete();
	}
}
