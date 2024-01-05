package com.springmysql.springmysql.springbootmysqldemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String getAllUse() {
		String name=sqlCon.getMap();
		return name;
	}

}