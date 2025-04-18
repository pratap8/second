package com.example.interview;

public class Employee {


	private String name;
	private String gender;
	private Double salary;
	private String department;
	public Employee(String name, String gender, Double salary, String department) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
	}
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	

}
