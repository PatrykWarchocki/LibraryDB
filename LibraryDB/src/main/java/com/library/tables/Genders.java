package com.library.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="genders", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"gender"})})
public class Genders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="genderID", nullable=false)
	private int genderID;
	
	@Column(name="gender", length=6, nullable=true, unique=true)
	private String gender;
	
	// ID
	public int getGenderID() {
		return genderID;
	}
	
	// Gender
	public void setGender(String arg) {
		this.gender = arg;
	}
	
	public String getGender() {
		return gender;
	}
}
