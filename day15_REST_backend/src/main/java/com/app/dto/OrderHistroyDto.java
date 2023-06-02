package com.app.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
public class OrderHistroyDto {

	private int quantity;
	private double totalPrice;
	private Long dishId;
	private Long orderId;
	private String dishName;
	private int dishPrice;
	private LocalDate orderdate;
	
	public OrderHistroyDto(int quantity, double totalPrice, Long dish, Long order, String dishName, int dishPrice,LocalDate orderdate) {
		super();
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.dishId = dish;
		this.orderId = order;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
		this.orderdate = orderdate;
	}

	public OrderHistroyDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Long getDishId() {
		return dishId;
	}

	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}

	public LocalDate getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}
	
	
	
	
	
	
	
	
}
