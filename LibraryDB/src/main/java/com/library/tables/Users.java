package com.library.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genderID")
	private Genders gender; // Foreign Key - Genders.id
    
	@Column(name="address", length=40, nullable=true)
	private String address;
	
	@Column(name="mobilePhone", length=9, nullable=true, unique=true)
	private String mobilePhone;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleID")
	private Roles role; // Foreign Key - Roles.id
    
    @Column(name="status", nullable=true)
	private boolean status;
	
	// ID
	public int getID() {
		return userID;
	}
	
	// Login
	public void setLogin(String arg) {
		this.login = arg;
	}
	
	public String getLogin() {
		return login;
	}
	
	// Password
	public void setPassword(String arg) {
		this.password = arg;
	}
	
	public String getPassword() {
		return password;
	}
	
	// Email
	public void setEmail(String arg) {
		this.email = arg;
	}
	
	public String getEmail() {
		return email;
	}
	
	// First Name
	public void setFirstName(String arg) {
		this.firstname = arg;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	// Surname
	public void setSurname(String arg) {
		this.surname = arg;
	}
	
	public String getSurname() {
		return surname;
	}
	
	// Gender
	public void setGender(Genders arg) {
		this.gender = arg;
	}
	
	public Genders getGender() {
		return gender;
	}
	
	// Address
	public void setAddress(String arg) {
		this.address = arg;
	}
	
	public String getAddress() {
		return address;
	}
	
	// Mobile Phone
	public void setMobilePhone(String arg) {
		this.mobilePhone = arg;
	}
	
	public String getMobilePhone() {
		return mobilePhone;
	}
	
	// Role
	public void setRole(Roles arg) {
		this.role = arg;
	}
	
	public Roles getRole() {
		return role;
	}
	
	// Status
	public void setStatus(boolean arg) {
		this.status = arg;
	}
	
	public boolean getStatus() {
		return status;
	}
}	
