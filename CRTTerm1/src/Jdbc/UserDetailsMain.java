package Jdbc;

import java.sql.*;
import java.util.*;

public class UserDetailsMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your details:");
		 System.out.println("Enter your name:");
		  String name=sc.next();
		  System.out.println("Enter your Aadhar_id:"); 
		  String aadhar_id=sc.next();
		  System.out.println("Enter your City:");
		  String city=sc.next();
		  System.out.println("Enter your State:");
		  String state=sc.next();
		  System.out.println("Enter your Pincode:");
		  int pincode=sc.nextInt();
		  System.out.println("Enter your Number of Dependents:");
		  int numberOfDependents=sc.nextInt();
		  
		  UserDetails d = new UserDetails();
		  d.setName(name);
		  d.setAadhar_id(aadhar_id);
		  d.setCity(city);
		  d.setState(state);
		  d.setPincode(pincode);
		  d.setNumberOfDependents(numberOfDependents);
		  
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			 
		 String sql = "insert into UserDetails values(?,?,?,?,?,?)";
		
		 PreparedStatement ps= con.prepareStatement(sql);
		 ps.setString(1,d.getName());
		 ps.setString(2,d.getAadhar_id());
		 ps.setString(3,d.getCity());
		 ps.setString(4,d.getState());
		 ps.setInt(5,d.getPincode());
		 ps.setInt(6,d.getNumberOfDependents());
		
		 int rs = ps.executeUpdate();
		 System.out.println(rs);
		 
		 if(rs>0)
		 {
			 con.commit();
			 System.out.println("Inserted successfully");
		 }
	}

}
