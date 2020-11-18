package demo;

public class Vehicle {
  int vno;
  String color;
  int seat;
  int wheel;
  
  public Vehicle(){}
  
public Vehicle(int vno, String color, int seat,int wheel) {
	super();
	this.vno = vno;
	this.color = color;
	this.seat = seat;
	this.wheel=wheel;
}

public int getVno() {
	return vno;
}
public void setVno(int vno) {
	this.vno = vno;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getSeat() {
	return seat;
}
public void setSeat(int seat) {
	this.seat = seat;
}

public int getWheel() {
	return wheel;
}

public void setWheel(int wheel) {
	this.wheel = wheel;
}

  
}
