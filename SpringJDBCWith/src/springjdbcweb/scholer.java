package springjdbcweb;

public class scholer {
int scid,marks;
String name,adress,email,phno,status;

public scholer() {
	super();
}
public scholer(int scid, int marks, String name, String adress, String email, String phno, String status) {
	super();
	this.scid = scid;
	this.marks = marks;
	this.name = name;
	this.adress = adress;
	this.email = email;
	this.phno = phno;
	this.status = status;
}
public int getScid() {
	return scid;
}
public void setScid(int scid) {
	this.scid = scid;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
