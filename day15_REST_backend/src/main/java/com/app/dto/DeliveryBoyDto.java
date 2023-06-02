package com.app.dto;

import com.app.pojos.Gender;
import com.app.pojos.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class DeliveryBoyDto {

	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String username;
	
	private Gender gender;
	
	private String mobileNo;
	
	private Status deliveryBoyStatus;

	public DeliveryBoyDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeliveryBoyDto(String firstName, String lastName, String email, String password, String username,
			Gender gender, String mobileNo, Status deliveryBoyStatus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.username = username;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.deliveryBoyStatus = deliveryBoyStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Status getDeliveryBoyStatus() {
		return deliveryBoyStatus;
	}

	public void setDeliveryBoyStatus(Status deliveryBoyStatus) {
		this.deliveryBoyStatus = deliveryBoyStatus;
	}

	@Override
	public String toString() {
		return "DeliveryBoyDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", username=" + username + ", gender=" + gender + ", mobileNo=" + mobileNo
				+ ", deliveryBoyStatus=" + deliveryBoyStatus + "]";
	}
	
	
	
	
}
