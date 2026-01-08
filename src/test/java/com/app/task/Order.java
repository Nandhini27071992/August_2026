package com.app.task;

public class Order {
	private int orderId;
	private String orderDate;
	private boolean isShipped;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public boolean isShipped() {
		return isShipped;
	}
	public void setShipped(boolean isShipped) {
		this.isShipped = isShipped;
	}
}
