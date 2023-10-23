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
	public void setUserID(Users arg) {
		this.userID = arg;
	}
	
	public Users getUserID() {
		return userID;
	}
	
	// BookID
	public void setBookID(Books arg) {
		this.bookID = arg;
	}
	
	public Books getBookID() {
		return bookID;
	}
	
	// OrderID
	public void setOrderID(Orders arg) {
		this.orderID = arg;
	}
	
	public Orders getOrderID() {
		return orderID;
	}
	
	// Issued
	public void setIssued(boolean arg) {
		this.issued = arg;
	}
	
	public boolean getIssued() {
		return issued;
	}
}
