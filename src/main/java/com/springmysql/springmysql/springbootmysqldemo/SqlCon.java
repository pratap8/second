package com.springmysql.springmysql.springbootmysqldemo;

import java.sql.*;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class SqlCon {

	public String getMap() throws ClassNotFoundException, SQLException {
		 String url = "jdbc:mysql://localhost:3306/sys";
		 String username = "root";
		 String password = "root";

		 System.out.println("Connecting database ...");
		
		 try (Connection connection = DriverManager.getConnection(url, username, password)) {
		     System.out.println("Database connected!");  
		     Statement st = connection.createStatement();
//		     String sql = ("SELECT * FROM first;");
		     ResultSet rs = st.executeQuery("select * from first");
		        System.out.println("rs  " + rs);
		        int count = 1;  
		        String vehicleType = null;
		        int empNum ;
	            String lastName = null;
	            String firstName= null;
		        while (rs.next()) {
		        	empNum = rs.getInt("id");
		            lastName = rs.getString("Name");
		            firstName = rs.getString("Ranker");
		            count++;
		            System.out.println(empNum+" "+lastName+" "+firstName);
		        }
		       
		           
		    
		     connection.close();
		     return lastName;
		 } catch (SQLException e) {
		     throw new IllegalStateException("Cannot connect the database!", e);
		 }
	}
	}

