package com.coffeeapp.CoffeeShopApp.entity;

public class Users {

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNum;
	private String password;
	private boolean newsletter;

	public Users() {
		firstName = "";
		lastName = "";
		email = "";
		phoneNum = "";
		password = "";
		newsletter = false;
	}

	public Users(String firstName, String lastName, String email, String phoneNum, String password,
			boolean newsletter) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.password = password;
		this.newsletter = newsletter;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNum=" + phoneNum
				+ ", password=" + password + ", newsletter=" + newsletter;
	}

}
