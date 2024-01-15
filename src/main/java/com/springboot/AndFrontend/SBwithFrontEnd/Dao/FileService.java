package com.springboot.AndFrontend.SBwithFrontEnd.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springboot.AndFrontend.SBwithFrontEnd.model.Fileprog;

@Service
public class FileService{


	public String logger(Map<String, String> a) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
		Statement ps = con.createStatement();
		System.out.println("db connected");
		String name = a.get("name");
		String passc = a.get("passc");
		ResultSet set = ps.executeQuery("Select * from fileprog");
		while(set.next()) {
			if(name.equals(set.getString("FIRSTNAME")) && passc.equals(set.getString("PASSC"))) {
				System.out.println("logging inn");
				return "welcome";  
			}
		}
		return "errorlogin";
	}
	public String register(String phone, String firstname,String lastname, String password) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
		Statement ps = con.createStatement();
		System.out.println("db connected");
		boolean set = ps.execute("insert into fileprog(PHONE,FIRSTNAME,LASTNAME,PASSC) VALUES('"+phone+"','"+firstname+"','"+lastname+"','"+password+"')");
		if(set) {
			System.out.println("not executed");
			return "errorregister";
		}
		System.out.println("Register");
		return "login";  
	}

}
