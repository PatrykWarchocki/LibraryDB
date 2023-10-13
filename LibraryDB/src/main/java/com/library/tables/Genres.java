package com.library.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="genres", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"genre"})})
public class Genres {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private int id;
	
	@Column(name="genre", length=25, nullable=true, unique=true)
	private String genre;
	
	// ID
	public int GetID() {
		return id;
	}
	
	// Genre
	public void SetGenre(String arg) {
		this.genre = arg;
	}
	
	public String GetGenre() {
		return genre;
	}
}
