package Jdbc;

/* Write a Java program to insert data into 'Scholar' table with columns { ScholarId, SName, Course, JoinDate, Phone} Use exceptions wherever applicable.
Note:
1) Read all inputs from the user and insert into the table.
2) Use PreparedStatement and pass all values as parameter.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Scholar 
{
    int Scholar_id;
    String SName;
    String Course;
    String phone;
    
	public Scholar(int scholar_id, String sName, String course, String phone) {
		super();
		Scholar_id = scholar_id;
		SName = sName;
		Course = course;
		this.phone = phone;
	}

	public Scholar() {
		super();
	}

	public int getScholar_id() {
		return Scholar_id;
	}

	public String getSName() {
		return SName;
	}

	public String getCourse() {
		return Course;
	}

	public String getPhone() {
		return phone;
	}

	public void setScholar_id(int scholar_id) {
		Scholar_id = scholar_id;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	} 
}
