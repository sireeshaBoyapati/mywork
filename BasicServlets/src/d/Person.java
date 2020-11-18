package d;

import java.io.Serializable;

public class Person implements Serializable 
{
 String name,gender,phone;
 int age;
 address add;
public Person(String name, String gender, String phone, int age) {
	super();
	this.name = name;
	this.gender = gender;
	this.phone = phone;
	this.age = age;
}
public Person() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public address getAdd() {
	return add;
}
public void setAdd(address add) {
	this.add = add;
}
 
}
