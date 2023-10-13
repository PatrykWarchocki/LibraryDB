package com.library.tables;

public class BookPossesion {
	// Variables
	private Users userID; // Foreign Key - Users.id
	private Books bookID; // Foreign Key - Books.id
	private Orders orderID; // Foreign Key - Orders.id
	private boolean issued;
	
	// UserID
	public void SetUserID(Users arg) {
		this.userID = arg;
	}
	
	public Users GetUserID() {
		return userID;
	}
	
	// BookID
	public void SetBookID(Books arg) {
		this.bookID = arg;
	}
	
	public Books GetBookID() {
		return bookID;
	}
	
	// OrderID
	public void SetOrderID(Orders arg) {
		this.orderID = arg;
	}
	
	public Orders GetOrderID() {
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
