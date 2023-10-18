package com.library.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="authors", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
public class Authors {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="authorID", nullable=false)
	private int authorID;
	
	@Column(name="name", length=50, nullable=true, unique=true)
	private String name;
	
	// ID
	public int GetID() {
		return authorID;
	}
	
	// Name
	public void SetName(String arg) {
		this.name = arg;
	}
	
	public String GetName() {
		return name;
	}
}
