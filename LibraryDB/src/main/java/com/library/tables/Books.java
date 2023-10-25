package com.library.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	// variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bookID", nullable=false)
	private int bookID;
	
	@Column(name="title", length=100, nullable=true)
	private String title;
	
	@Column(name="cover", length=26, nullable=true)
	private String cover;
	
	@OneToOne
    @JoinColumn(name = "authorID")
	private Authors author; // Foreign key - Authors.id
    
    @Column(name="publicationYear", nullable=true)
	private int publicationYear;
    
    @OneToOne
    @JoinColumn(name = "genreID")
	private Genres genre; // Foreign key - Genres.id
    
	@Column(name="description", length=280, nullable=true)
	private String description;
	
    @Column(name="totalAmount", nullable=true)
	private int totalAmount;
    
    @Column(name="deleted", nullable=true)
	private boolean deleted;

	// ID
	public int setID() {
		return bookID;
	}

	// Title
	public void setTitle(String arg) {
		this.title = arg;
	}

	public String getTitle() {
		return title;
	}

	// Cover
	public void setCover(String arg) {
		this.cover = arg;
	}

	public String getCover() {
		return cover;
	}

	// Author - Foreign Key
	public void setAuthor(Authors arg) {
		this.author = arg;
	}

	public Authors getAuthor() {
		return author;
	}

	// Publication Year
	public void setPublicationYear(int arg) {
		this.publicationYear = arg;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	// Genre - Foreign Key
	public void setGenre(Genres arg) {
		this.genre = arg;
	}

	public Genres getGenre() {
		return genre;
	}
	
	// Description
	public void setDescription(String arg) {
		this.description = arg;
	}

	public String getDescription() {
		return description;
	}
	
	// Total Amount
	public void setTotalAmount(int arg) {
		this.totalAmount = arg;
	}

	public int getTotalAmount() {
		return totalAmount;
	}
	
	// Deleted
	public void setDeleted(boolean arg) {
		this.deleted = arg;
	}
	
	public boolean getDeleted() {
		return deleted;
	}
}
