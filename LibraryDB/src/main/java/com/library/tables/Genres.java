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
	@Column(name="genreID", nullable=false)
	private int genreID;
	
	@Column(name="genre", length=25, nullable=true, unique=true)
	private String genre;
	
	// ID
	public int getGenreID() {
		return genreID;
	}
	
	// Genre
	public void setGenre(String arg) {
		this.genre = arg;
	}
	
	public String getGenre() {
		return genre;
	}
}
