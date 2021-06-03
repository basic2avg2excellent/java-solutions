package utility.input;

import java.io.Serializable;

//Why I need to make this class @Serializable, read about it again.
public class Address implements Serializable{	
	private static final long serialVersionUID = -3698719169458225524L;

	private String addressType;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private String landMark;
	
	//Max 8 digit
	private Integer pinCode;

	public Address(String country, String state, String city, String landMark, Integer pinCode) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.landMark = landMark;
		this.pinCode = pinCode;
	}
	
	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
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

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}	
}