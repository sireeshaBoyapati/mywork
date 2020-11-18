package Jdbc;

public class UserDetails 
{
  String name;
  String aadhar_id;
  String city;
  String state;
  int pincode;
  int numberOfDependents;
  
  //Creating getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhar_id() {
		return aadhar_id;
	}
	public void setAadhar_id(String aadhar_id) {
		this.aadhar_id = aadhar_id;
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
	public int getNumberOfDependents() {
		return numberOfDependents;
	}
	public void setNumberOfDependents(int numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}
	
	//Overriding toString method
	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", aadhar_id=" + aadhar_id + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", numberOfDependents=" + numberOfDependents + "]";
	}
	  
  
}
