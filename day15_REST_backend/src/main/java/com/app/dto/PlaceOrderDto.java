package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PlaceOrderDto {

	private Long cartId;
	private double totalAmount ; 
	private Long hotelId;
	public PlaceOrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlaceOrderDto(Long cartId, double totalAmount, Long hotelId) {
		super();
		this.cartId = cartId;
		this.totalAmount = totalAmount;
		this.hotelId = hotelId;
	}
	public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	
	
	
	
	
	
	
}
