package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Entity
@Table(name = "deliveryboytable")
public class DeliveryBoy extends BaseEntity {
	@Column(name = "firstName",length = 50)
	private String firstName;
	@Column(name = "lastName",length = 50)
	private String lastName;
	@Column(name = "email",length = 50)
	private String email;
	@Column(name = "password",length = 50)
	private String password;
	@Column(name = "username",length = 50)
	private String username;
	@Column(name = "gender",length = 50)
	private Gender gender;
	@Column(name = "photo",length = 50)
	private String photo;
	@Column(name = "mobileNo",length = 50)
	private String mobileNo;
	@Column(name = "deliveryBoyStatus")
	private Status deliveryBoyStatus;
	
	@Embedded
	private Address address;
	
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private Orders order;


	public DeliveryBoy() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DeliveryBoy(String firstName, String lastName, String email, String password, String username, Gender gender,
			String photo, String mobileNo, Status deliveryBoyStatus, Address address, Orders order) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.username = username;
		this.gender = gender;
		this.photo = photo;
		this.mobileNo = mobileNo;
		this.deliveryBoyStatus = deliveryBoyStatus;
		this.address = address;
		this.order = order;
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


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
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


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Orders getOrder() {
		return order;
	}


	public void setOrder(Orders order) {
		this.order = order;
	}


	@Override
	public String toString() {
		return "DeliveryBoy [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", username=" + username + ", gender=" + gender + ", photo=" + photo + ", mobileNo="
				+ mobileNo + ", deliveryBoyStatus=" + deliveryBoyStatus + ", address=" + address + ", order=" + order
				+ "]";
	}
	
	
	
	
	
	
	
    	
	
	
	
	
	
	

}
