package com.address;

import java.util.Scanner;

public class PersonalInformation {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;

	PersonalInformation(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first name");
	firstName = sc.nextLine();
	System.out.println("enter the last name");
	lastName = sc.nextLine();
	System.out.println("enter the address");
	address = sc.nextLine();
	System.out.println("enter the city");
	city = sc.nextLine();
	System.out.println("enter the state");
	state = sc.nextLine();
	System.out.println("enter the zip");
	zip = sc.nextLine();
	System.out.println("enter the phone number");
	phoneNumber = sc.nextLine();
      }

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getstate() {
		return state;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public String getzip() {
		return zip;
	}

	public void setzip(String zip) {
		this.zip = zip;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
