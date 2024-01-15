package com.springboot.AndFrontend.SBwithFrontEnd.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.AndFrontend.SBwithFrontEnd.Dao.FileService;


@Controller 
public class FirstController{
	
	@Autowired
	FileService dao;

	@RequestMapping("/")
	public String newer() {
		return "newer";
	}
	@RequestMapping("/login/logger")
	public String login(@RequestParam String firstname, @RequestParam String passc) throws SQLException{
		Map<String, String> a = new HashMap<String, String>();
		a.put("name", firstname);
		a.put("passc", passc);
		
		
		return dao.logger(a);
	}
	@PostMapping("/register/formfilled")
	public String register(@RequestParam String phone,@RequestParam String firstname, @RequestParam String lastname, @RequestParam String passc) throws SQLException{
		
		if(firstname.isEmpty() || passc.isEmpty() || lastname.isEmpty()) {
			return "errorregister";  
		}
		
		return dao.register(phone,firstname, lastname, passc);
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	

}
