package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "customertable")
public class Customer extends BaseEntity {
	@Column(name = "firstName",length = 50)
	private String firstName;
	@Column(name = "lastName",length = 50)
	private String lastName;
	@Column(name = "email",length = 50,unique = true)
	private String email;
	@Column(name = "password",length = 50)
	private String password;
	@Column(name = "username",length = 50)
	private String username;
	@Column(name = "gender",length = 50)
	private Gender gender;
	@Column(name = "photo",length = 50)
	private String photo;
	@Column(name = "mobileNo",length = 10)
	private String mobileNo;
	
//	@JsonIgnore
	@ElementCollection
	@CollectionTable(name = "customeraddress",joinColumns = @JoinColumn(name="customer_id"))
	private List<Address> addressList=new ArrayList<Address>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Cards> cardList=new ArrayList<>();
	
	@JsonIgnore
	@OneToOne(mappedBy = "customer" , cascade = CascadeType.ALL, orphanRemoval = true)
	private Cart cart;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Orders> ordersList = new ArrayList<Orders>();
	
	public void addCart(Cart c1) { 
		  // TODO Auto-generated method stub 
		  this.setCart(c1); 
		  c1.setCustomer(this); 
		   
		 } 
		 
		 public void removeCart(Cart c) { 
		  // TODO Auto-generated method stub 
		  this.setCart(null); 
		  c.setCustomer(null); 
		   
		 }

		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Customer(String firstName, String lastName, String email, String password, String username,
				Gender gender, String photo, String mobileNo, List<Address> addressList, List<Cards> cardList,
				Cart cart, List<Orders> ordersList) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
			this.username = username;
			this.gender = gender;
			this.photo = photo;
			this.mobileNo = mobileNo;
			this.addressList = addressList;
			this.cardList = cardList;
			this.cart = cart;
			this.ordersList = ordersList;
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

		public List<Address> getAddressList() {
			return addressList;
		}

		public void setAddressList(List<Address> addressList) {
			this.addressList = addressList;
		}

		public List<Cards> getCardList() {
			return cardList;
		}

		public void setCardList(List<Cards> cardList) {
			this.cardList = cardList;
		}

		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}

		public List<Orders> getOrdersList() {
			return ordersList;
		}

		public void setOrdersList(List<Orders> ordersList) {
			this.ordersList = ordersList;
		}

		@Override
		public String toString() {
			return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
					+ password + ", username=" + username + ", gender=" + gender + ", photo=" + photo + ", mobileNo="
					+ mobileNo + ", addressList=" + addressList + ", cardList=" + cardList + ", cart=" + cart
					+ ", ordersList=" + ordersList + "]";
		}	
		 
		 
	
	
	
	
	
	

}
