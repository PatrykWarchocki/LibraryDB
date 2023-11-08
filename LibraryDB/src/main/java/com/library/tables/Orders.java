package com.library.tables;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="orders")
public class Orders {
	// Variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orderID", nullable=false)
	private int orderID;
	
    @OneToOne
    @JoinColumn(name = "userID")
	private Users userID; // Foreign Key - Users.userID
    
    @Column(name="orderDate", nullable=true)
    @Temporal(TemporalType.DATE)
	private LocalDate orderDate;
	
    @OneToOne
    @JoinColumn(name = "oTypeID")
	private OrderType orderType; // Foreign Key - OrderType.id
    
    @Column(name="dateFrom", nullable=true)
    @Temporal(TemporalType.DATE)
	private LocalDate dateFrom;
    
    @Column(name="dateTo", nullable=true)
    @Temporal(TemporalType.DATE)
	private LocalDate dateTo;
    
    @Column(name="status", nullable=true)
	private boolean status;

	// ID
	public int getID() {
		return orderID;
	}

	// UserID
	public void setUserID(Users arg) {
		this.userID = arg;
	}

	public Users getUserID() {
		return userID;
	}

	// Order Date
	public void setOrderDate(LocalDate arg) {
		this.orderDate = arg;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	// Order Type
	public void setOrderType(OrderType arg) {
		this.orderType = arg;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	// Date From
	public void setDateFrom(LocalDate arg) {
		this.dateFrom = arg;
	}

	public LocalDate getDateFrom() {
		return dateFrom;
	}

	// Date To
	public void setDateTo(LocalDate arg) {
		this.dateTo = arg;
	}

	public LocalDate getDateTo() {
		return dateTo;
	}

	// Status
	public void setStatus(boolean arg) {
		this.status = arg;
	}

	public boolean gsetStatus() {
		return status;
	}
}
