package com.example.demo.Objects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class EmployeeObj {

	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee("Phool", 30),
				new Employee("Babu", 12),
				new Employee("Raj", 23),
				new Employee("Pratap", 5),
				new Employee("Singh", 100));
		List<Employee> str = emp.stream().filter(x->x.getAge()>20).collect(Collectors.toList());
		System.out.println(emp.stream().max(Comparator.comparingInt(Employee::getAge)));
		System.out.println(str);
	}
}
class Employee{
	private String name;
	private int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
}
