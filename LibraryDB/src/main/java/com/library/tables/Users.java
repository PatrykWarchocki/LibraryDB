package com.library.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="users", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"login", "email", "mobilePhone"})})
public class Users {
	// Variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userID", nullable=false, unique=true)
	private int userID;
	
	@Column(name="login", length=12, nullable=true, unique=true)
	private String login;
	
	@Column(name="password", length=12, nullable=true)
	private String password;
	
	@Column(name="email", length=24, nullable=true, unique=true)
	private String email;
	
	@Column(name="firstname", length=20, nullable=true)
	private String firstname;
	
	@Column(name="surname", length=20, nullable=true)
	private String surname;
	
    @OneToOne
    @JoinColumn(name = "genderID")
	private Genders gender; // Foreign Key - Genders.id
    
	@Column(name="address", length=40, nullable=true)
	private String address;
	
	@Column(name="mobilePhone", length=9, nullable=true, unique=true)
	private String mobilePhone;
	
    @OneToOne
    @JoinColumn(name = "roleID")
	private Roles role; // Foreign Key - Roles.id
    
    @Column(name="status", nullable=true)
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
	public void SetGender(Genders arg) {
		this.gender = arg;
	}
	
	public Genders GetGender() {
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
	public void SetRole(Roles arg) {
		this.role = arg;
	}
	
	public Roles GetRole() {
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
