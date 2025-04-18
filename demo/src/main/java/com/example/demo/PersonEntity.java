package com.example.demo;

import java.io.Serializable;

public class PersonEntity implements Serializable{

	private String name;
	private String age;
	public PersonEntity(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public PersonEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PersonEntity [name=" + name + ", age=" + age + "]";
	}
	
}
