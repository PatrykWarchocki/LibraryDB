package com.library.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="roles", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"role"})})
public class Roles {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roleID", nullable=false)
	private int roleID;
	
	@Column(name="role", length=15, nullable=true, unique=true)
	private String role;
	
	// ID
	public int GetRoleID() {
		return roleID;
	}
	
	// Gender
	public void SetRole(String arg) {
		this.role = arg;
	}
	
	public String GetRole() {
		return role;
	}
}
