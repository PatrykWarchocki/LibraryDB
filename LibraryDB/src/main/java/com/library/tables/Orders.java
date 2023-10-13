package com.library.tables;

import java.util.Date;

public class Orders {
	// Variables
	private int orderID;
	private Users userID; // Foreign Key - Users.userID
	private Date orderDate;
	private OrderType orderType; // Foreign Key - OrderType.id
	private Date dateFrom;
	private Date dateTo;
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
