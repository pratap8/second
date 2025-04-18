package com.example.demo.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ListPrac {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 25));
        employees.add(new Employee("Charlie", 35));
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 25));
        employees.add(new Employee("Charlie", 35));
        
        List<Employee> emp = employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        emp.stream().forEach(System.out::println);
	}
}
class Employee{
	String name;
	int age;
	public Employee(String name, int age) {
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
