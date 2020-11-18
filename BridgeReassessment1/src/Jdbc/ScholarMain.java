package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ScholarMain 
{
	
	public static void main(String args[])
    {
    	Connection con;
    	
    	try 
    	{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    	    con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","system","system");
    	    
    	    String sql = "insert into Scholar(Scholar_id,SName,Course,Phone) values(?,?,?,?)";
    	    
    	    PreparedStatement ps = con.prepareStatement(sql);
    	    
    	    ps.executeUpdate(sql);
		} 
    	
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
}
