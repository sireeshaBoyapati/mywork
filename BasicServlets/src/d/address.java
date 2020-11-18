package d;

public class address {

	String hnum,street,city,state;
	int pincode;
	public address(String hnum, String street, String city, String state, int pincode) {
		super();
		this.hnum = hnum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public address() {
		super();
	}
	public String getHnum() {
		return hnum;
	}
	public void setHnum(String hnum) {
		this.hnum = hnum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
