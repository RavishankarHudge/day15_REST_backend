package com.app.dto;



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
public class AddressDto {
	
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private String pincode;

	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressDto(String addressLine1, String addressLine2, String country, String state, String city,
			String pincode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressDto [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", country=" + country
				+ ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
}
