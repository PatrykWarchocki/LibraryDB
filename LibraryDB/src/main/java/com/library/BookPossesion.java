package com.library;

public class BookPossesion {
	// Variables
	private int userID;
	private int bookID;
	private int orderID;
	private boolean issued;
	
	// UserID
	public void SetUserID(int arg) {
		this.userID = arg;
	}
	
	public int GetUserID() {
		return userID;
	}
	
	// BookID
	public void SetBookID(int arg) {
		this.bookID = arg;
	}
	
	public int GetBookID() {
		return bookID;
	}
	
	// OrderID
	public void SetOrderID(int arg) {
		this.orderID = arg;
	}
	
	public int GetOrderID() {
		return orderID;
	}
	
	// Issued
	public void SetIssued(boolean arg) {
		this.issued = arg;
	}
	
	public boolean GetIssued() {
		return issued;
	}
}
