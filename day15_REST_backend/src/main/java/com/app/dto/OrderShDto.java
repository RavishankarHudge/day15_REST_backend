package com.app.dto;

import java.time.LocalDate;

import com.app.pojos.BaseEntity;
import com.app.pojos.CookingStatus;
import com.app.pojos.DeliveryBoy;
import com.app.pojos.DeliveryStatus;
import com.app.pojos.OrderStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
@NoArgsConstructor
@JsonInclude(Include.NON_EMPTY)
public class OrderShDto extends BaseEntity {
	private double price;
	private String orderNo;
	private LocalDate orderDate;
	private OrderStatus orderStatus;
    private CookingStatus cookingStatus;
	private DeliveryStatus deliveryStatus;
	private String deliveryBoyName;
	private String deliveryBoyNo;
	private String hotelId;
	
	
	public OrderShDto(double price, LocalDate orderDate, OrderStatus orderStatus, CookingStatus cookingStatus,
			DeliveryStatus deliveryStatus,String deliveryMobileNo, String deliveryName,Long Id,Long hotelId) {
		super();
		this.price = price;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.cookingStatus = cookingStatus;
		this.deliveryStatus = deliveryStatus;
		this.deliveryBoyName = deliveryName;
		this.deliveryBoyNo = deliveryMobileNo;
		this.orderNo = ""+Id;
		this.hotelId = ""+hotelId;
	}


	public OrderShDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getOrderNo() {
		return orderNo;
	}


	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}


	public LocalDate getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}


	public OrderStatus getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}


	public CookingStatus getCookingStatus() {
		return cookingStatus;
	}


	public void setCookingStatus(CookingStatus cookingStatus) {
		this.cookingStatus = cookingStatus;
	}


	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}


	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}


	public String getDeliveryBoyName() {
		return deliveryBoyName;
	}


	public void setDeliveryBoyName(String deliveryBoyName) {
		this.deliveryBoyName = deliveryBoyName;
	}


	public String getDeliveryBoyNo() {
		return deliveryBoyNo;
	}


	public void setDeliveryBoyNo(String deliveryBoyNo) {
		this.deliveryBoyNo = deliveryBoyNo;
	}


	public String getHotelId() {
		return hotelId;
	}


	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}


	@Override
	public String toString() {
		return "OrderShDto [price=" + price + ", orderNo=" + orderNo + ", orderDate=" + orderDate + ", orderStatus="
				+ orderStatus + ", cookingStatus=" + cookingStatus + ", deliveryStatus=" + deliveryStatus
				+ ", deliveryBoyName=" + deliveryBoyName + ", deliveryBoyNo=" + deliveryBoyNo + ", hotelId=" + hotelId
				+ "]";
	}
	
	
	
	
}
