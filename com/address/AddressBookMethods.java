package com.address;

import java.util.ArrayList;

public class AddressBookMethods {
	ArrayList<PersonalInformation> addressBook = new ArrayList<PersonalInformation>();

	void Add() {
		PersonalInformation info = new PersonalInformation();
		 addressBook.add(info);
	}
}
