package com.library.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="orderType", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class OrderType {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true)
	private int id;
	
	@Column(name="type", length=6, nullable=true, unique=true)
	private String type;
	
	// ID	
	public int GetID() {
		return id;
	}
	
	// Type
	public void SetType(String arg) {
		this.type = arg;
	}
	
	public String GetType() {
		return type;
	}
}
