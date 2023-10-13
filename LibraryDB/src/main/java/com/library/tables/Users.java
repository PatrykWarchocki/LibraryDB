package com.library.tables;

public class Users {
	// Variables
	private int userID;
	private String login;
	private String password;
	private String email;
	private String firstname;
	private String surname;
	private int gender; // Foreign Key - Genders.id
	private String address;
	private String mobilePhone;
	private int role; // Foreign Key - Roles.id
	private boolean status;
	
	// ID
	public int GetID() {
		return userID;
	}
	
	// Login
	public void SetLogin(String arg) {
		this.login = arg;
	}
	
	public String GetLogin() {
		return login;
	}
	
	// Password
	public void SetPassword(String arg) {
		this.password = arg;
	}
	
	public String GetPassword() {
		return password;
	}
	
	// Email
	public void SetEmail(String arg) {
		this.email = arg;
	}
	
	public String GetEmail() {
		return email;
	}
	
	// First Name
	public void SetFirstName(String arg) {
		this.firstname = arg;
	}
	
	public String GetFirstName() {
		return firstname;
	}
	
	// Surname
	public void SetSurname(String arg) {
		this.surname = arg;
	}
	
	public String GetSurname() {
		return surname;
	}
	
	// Gender
	public void SetGender(int arg) {
		this.gender = arg;
	}
	
	public int GetGender() {
		return gender;
	}
	
	// Address
	public void SetAddress(String arg) {
		this.address = arg;
	}
	
	public String GetAddress() {
		return address;
	}
	
	// Mobile Phone
	public void SetMobilePhone(String arg) {
		this.mobilePhone = arg;
	}
	
	public String GetMobilePhone() {
		return mobilePhone;
	}
	
	// Role
	public void SetRole(int arg) {
		this.role = arg;
	}
	
	public int GetRole() {
		return role;
	}
	
	// Status
	public void SetStatus(boolean arg) {
		this.status = arg;
	}
	
	public boolean GetStatus() {
		return status;
	}
}	
