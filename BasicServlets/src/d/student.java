package d;

import java.io.Serializable;

public class student implements Serializable {

	String name,phone,gender;
	int age;
	boolean reading;
	
	public student(){
		
	}
	public student(String name, String phone, String gender, int age, boolean reading) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.age = age;
		this.reading = reading;
	}

	public boolean isReading(){
		return reading;
	}
	public void setReading(boolean reading){
		this.reading = reading;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
