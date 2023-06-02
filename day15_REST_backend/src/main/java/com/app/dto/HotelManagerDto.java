package com.app.dto;



import com.app.pojos.Documents;

import com.app.pojos.hotelType;

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
public class HotelManagerDto {
	
	private String hotelName;
	
	private hotelType hotelType;
	
  	private String hotelphoto;
	
	private int rating;
	
	private String description;	
	
	private Long id;

	public HotelManagerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelManagerDto(String hotelName, com.app.pojos.hotelType hotelType, String hotelphoto, int rating,
			String description, Long id) {
		super();
		this.hotelName = hotelName;
		this.hotelType = hotelType;
		this.hotelphoto = hotelphoto;
		this.rating = rating;
		this.description = description;
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public hotelType getHotelType() {
		return hotelType;
	}

	public void setHotelType(hotelType hotelType) {
		this.hotelType = hotelType;
	}

	public String getHotelphoto() {
		return hotelphoto;
	}

	public void setHotelphoto(String hotelphoto) {
		this.hotelphoto = hotelphoto;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "HotelManagerDto [hotelName=" + hotelName + ", hotelType=" + hotelType + ", hotelphoto=" + hotelphoto
				+ ", rating=" + rating + ", description=" + description + ", id=" + id + "]";
	}
	
	
	
	
	
	
}
