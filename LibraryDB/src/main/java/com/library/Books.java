package com.library;

public class Books {
	// variables
	private int bookID;
	private String title;
	private String cover;
	private int author; // Foreign key - Authors.id
	private int publicationYear;
	private int genre; // Foreign key - Genres.id
	private String description;
	private int totalAmount;
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

	// Author
	public void SetAuthor(int arg) {
		this.author = arg;
	}

	public int GetAuthor() {
		return author;
	}

	// Publication Year
	public void SetPublicationYear(int arg) {
		this.publicationYear = arg;
	}

	public int GetPublicationYear() {
		return publicationYear;
	}

	// Genre
	public void SetGenre(int arg) {
		this.genre = arg;
	}

	public int GetGenre() {
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
