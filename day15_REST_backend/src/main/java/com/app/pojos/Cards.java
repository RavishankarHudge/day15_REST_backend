package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "debitcards")

public class Cards extends BaseEntity {
	
	@Column(name = "cardHolderName",length = 50)
	private String cardHolderName;
	
	@Column(name = "cvv",length = 50)
	private String cvv;
	
	@Column(name = "cardNumber",length = 50,unique = true)
	private String cardNumber;
	
	@Column(name = "expdate")
	private LocalDate expdate;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;

	public Cards() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cards(String cardHolderName, String cvv, String cardNumber, LocalDate expdate, Customer customer) {
		super();
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
		this.cardNumber = cardNumber;
		this.expdate = expdate;
		this.customer = customer;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public LocalDate getExpdate() {
		return expdate;
	}

	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
	

}
