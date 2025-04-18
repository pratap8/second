package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SessionPrac {

	public static void main(String[] args) {
		//Max method
		List<Employee> employee = Arrays.asList(new Employee("LTI", 0),
				new Employee("kk", 1),
				new Employee("qq", 2),
				new Employee("ww", 4));
		Optional<Employee> emp = employee.stream().max(Comparator.comparingInt(Employee::getSalary));
		List<String> strings = Arrays
	              .asList("apple", "banana", "cherry", "date", "grapefruit");
		Optional<String> max = strings.stream().max(Comparator.comparingInt(String::length));
//		max.ifPresent(System.out::println);
		
//		emp.ifPresent(System.out::println);
		
		//mapToInt
		OptionalDouble average = employee.stream().mapToInt(Employee::getSalary).average();
//		average.ifPresent(System.out::println);
		List<Integer> inte = Arrays.asList(1,2,3,4,5);
		
		OptionalDouble average2 = inte.stream().mapToInt(Integer::intValue).average();
		average2.ifPresent(System.out::println);
		
	}
}
class Employee{
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}