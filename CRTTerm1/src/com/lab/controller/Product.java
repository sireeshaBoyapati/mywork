package com.lab.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

 

public class Product {
Connection conn;
public Product(){
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        System.out.println("connection establised");
        Scanner sc=new Scanner(System.in);
        Statement st=conn.createStatement();
        System.out.println("enter pid:");
        int pid=sc.nextInt();
        System.out.println("enter pname");
        String pname=sc.next();
        System.out.println("enter price");
        int price=sc.nextInt();
        System.out.println("enter quantity");
        int quantity=sc.nextInt();
        PreparedStatement preparedStatement=conn.prepareStatement("insert into product values(?,?,?,?)");
        preparedStatement.setInt(1,pid);
        preparedStatement.setString(2,pname);
        preparedStatement.setInt(3,price);
        preparedStatement.setInt(4,quantity);
        preparedStatement.execute();
        ResultSet rs=st.executeQuery("select * from product");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
public static void main(String[] args){
    new Product();
}
}
