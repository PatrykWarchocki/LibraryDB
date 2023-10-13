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
	   uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class Genders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true)
	private int id;
	
	@Column(name="gender", length=6, nullable=true, unique=true)
	private String gender;
	
	// ID
	public int GetID() {
		return id;
	}
	
	// Gender
	public void SetGender(String arg) {
		this.gender = arg;
	}
	
	public String GetGender() {
		return gender;
	}
}
