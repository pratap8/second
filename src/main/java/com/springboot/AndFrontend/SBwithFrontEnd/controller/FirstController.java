package com.springboot.AndFrontend.SBwithFrontEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.AndFrontend.SBwithFrontEnd.Dao.FileDao;
import com.springboot.AndFrontend.SBwithFrontEnd.model.FileEntity;

@Controller
@RequestMapping("/first")
public class FirstController implements CommandLineRunner {
	@Autowired
	FileDao repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Iterable<FileEntity> iterator = repository.findAll();
		System.out.println("worked");
		System.out.println("All expense items: ");
		iterator.forEach(item -> System.out.println(item));
	}

}
