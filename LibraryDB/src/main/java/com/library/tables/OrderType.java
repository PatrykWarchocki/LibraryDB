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
	   uniqueConstraints={@UniqueConstraint(columnNames={"type"})})
public class OrderType {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="oTypeID", nullable=false)
	private int oTypeID;
	
	@Column(name="type", length=6, nullable=true, unique=true)
	private String type;
	
	// ID	
	public int GetOTypeID() {
		return oTypeID;
	}
	
	// Type
	public void SetType(String arg) {
		this.type = arg;
	}
	
	public String GetType() {
		return type;
	}
}
