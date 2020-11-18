package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity//mapping the table to the class
public class Student {
	//mapping all the columns using annotations
	@Id
	@Column
	int RegNo;
	@Column
	String Sname;
	@Column
	String CourseName;
	@Column
	String Location;
	@Column
	int Score;

	public Student() {
		
	}

	public int getRegNo() {
		return RegNo;
	}

	public void setRegNo(int regNo) {
		RegNo = regNo;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}
	
	

}

