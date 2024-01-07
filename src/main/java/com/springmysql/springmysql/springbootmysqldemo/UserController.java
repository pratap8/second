package com.springmysql.springmysql.springbootmysqldemo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private SqlCon sqlCon;
	
	@GetMapping("/")
	public List<first> getAllUsers() {
		return userRepository.findAll();
	}
	@GetMapping("/name")
	public String getAllUse() throws ClassNotFoundException, SQLException {
		String name=sqlCon.getMap();
		return name;
	}
	@PostMapping("Data")
	public void postData() {
		
	}

}