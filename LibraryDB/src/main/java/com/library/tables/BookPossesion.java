package com.library.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bookPossesion")
public class BookPossesion {
	// Variables
    @OneToOne
    @JoinColumn(name = "userID")
	private Users userID; // Foreign Key - Users.id
    
    @OneToOne
    @JoinColumn(name = "bookID")
	private Books bookID; // Foreign Key - Books.id
    
    @OneToOne
    @JoinColumn(name = "orderID")
	private Orders orderID; // Foreign Key - Orders.id
    
    @Column(name="issued", nullable=true)
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
