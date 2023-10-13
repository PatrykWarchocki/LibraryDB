package com.library.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="books", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"bookID"})})
public class Books {
	// variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bookID", nullable=false, unique=true)
	private int bookID;
	
	@Column(name="title", length=100, nullable=true)
	private String title;
	
	@Column(name="cover", length=26, nullable=true)
	private String cover;
	
	@OneToOne
    @JoinColumn(name = "id")
	private Authors author; // Foreign key - Authors.id
    
    @Column(name="publicationYear", nullable=true)
	private int publicationYear;
    
    @OneToOne
    @JoinColumn(name = "id")
	private Genres genre; // Foreign key - Genres.id
    
	@Column(name="description", length=280, nullable=true)
	private String description;
	
    @Column(name="totalAmount", nullable=true)
	private int totalAmount;
    
    @Column(name="deleted", nullable=true)
	private boolean deleted;

	// ID
	public int GetID() {
		return bookID;
	}

	// Title
	public void SetTitle(String arg) {
		this.title = arg;
	}

	public String GetTitle() {
		return title;
	}

	// Cover
	public void SetCover(String arg) {
		this.cover = arg;
	}

	public String GetCover() {
		return cover;
	}

	// Author - Foreign Key
	public void SetAuthor(Authors arg) {
		this.author = arg;
	}

	public Authors GetAuthor() {
		return author;
	}

	// Publication Year
	public void SetPublicationYear(int arg) {
		this.publicationYear = arg;
	}

	public int GetPublicationYear() {
		return publicationYear;
	}

	// Genre - Foreign Key
	public void SetGenre(Genres arg) {
		this.genre = arg;
	}

	public Genres GetGenre() {
		return genre;
	}
	
	// Description
	public void SetDescription(String arg) {
		this.description = arg;
	}

	public String GetDecription() {
		return description;
	}
	
	// Total Amount
	public void SetTotalAmount(int arg) {
		this.totalAmount = arg;
	}

	public int GetTotalAmount() {
		return totalAmount;
	}
	
	// Deleted
	public void SetDeleted(boolean arg) {
		this.deleted = arg;
	}
	
	public boolean GetDeleted() {
		return deleted;
	}
}
