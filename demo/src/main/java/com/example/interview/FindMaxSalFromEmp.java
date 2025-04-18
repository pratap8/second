package com.example.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxSalFromEmp {



	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee("Phool", "male", 2000d, "IT"),
				new Employee("babu", "female", 3000d, "IT"),
				new Employee("raj", "male", 2200d, "IT"),
				new Employee("pratap", "male", 3100d, "IT"),
				new Employee("singh", "female", 2800d, "IT"),
				new Employee("manoj", "male", 1900d, "IT"));
		 Optional<Employee> empSal = emp.stream().max(Comparator.comparingDouble(Employee::getSalary));
		 System.out.println(empSal);
	}

}
