package com.library.tables;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

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
	private Date orderDate;
	
    @OneToOne
    @JoinColumn(name = "oTypeID")
	private OrderType orderType; // Foreign Key - OrderType.id
    
    @Column(name="dateFrom", nullable=true)
	private Date dateFrom;
    
    @Column(name="dateTo", nullable=true)
	private Date dateTo;
    
    @Column(name="status", nullable=true)
	private boolean status;

	// ID
	public int GetID() {
		return orderID;
	}

	// UserID
	public void SetUserID(Users arg) {
		this.userID = arg;
	}

	public Users GetUserID() {
		return userID;
	}

	// Order Date
	public void SetOrderDate(Date arg) {
		this.orderDate = arg;
	}

	public Date GetOrderDate() {
		return orderDate;
	}

	// Order Type
	public void SetOrderType(OrderType arg) {
		this.orderType = arg;
	}

	public OrderType GetOrderType() {
		return orderType;
	}

	// Date From
	public void SetDateFrom(Date arg) {
		this.dateFrom = arg;
	}

	public Date GetDateFrom() {
		return dateFrom;
	}

	// Date To
	public void SetDateTo(Date arg) {
		this.dateTo = arg;
	}

	public Date GetDateTo() {
		return dateTo;
	}

	// Status
	public void SetStatus(boolean arg) {
		this.status = arg;
	}

	public boolean GetStatus() {
		return status;
	}
}
