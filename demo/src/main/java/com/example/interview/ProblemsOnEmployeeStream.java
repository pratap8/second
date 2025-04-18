package com.example.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ProblemsOnEmployeeStream {

	
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee("Phool", "male", 2000d, "IT"),
				new Employee("babu", "female", 3000d, "IT"),
				new Employee("raj", "male", 2200d, "IT"),
				new Employee("pratap", "male", 3100d, "IT"),
				new Employee("singh", "female", 2800d, "IT"),
				new Employee("manoj", "male", 1900d, "IT"));
//		List<Employee> list=emp.stream().filter(x->x.getSalary()>2500d).collect(Collectors.toList());
//		System.out.println(list.toString());
//		Optional<Employee> sal=emp.stream().max(Comparator.comparingDouble(Employee::getSalary));
//		System.out.println(sal.toString());
//		Optional<Employee> femalSal = emp.stream().filter(x->x.getGender().equals("female") && x.getDepartment().equals("IT")).max(Comparator.comparingDouble(Employee::getSalary));
//		System.out.println(femalSal);
		Optional<Employee> emp1 = emp.stream().max(Comparator.comparingDouble(Employee::getSalary));
//		System.out.println(emp1);
		Optional<Employee> highSalMaleEmp = emp.stream().filter(x->x.getGender().equals("female")).max(Comparator.comparingDouble(Employee::getSalary));
		//Finding the employee have greater salary than average salary
		Double average = emp.stream().collect(Collectors.averagingDouble(x->x.getSalary()));
		List<Employee> list = emp.stream().filter(x->x.getSalary()>average).toList();
		OptionalDouble average2 = emp.stream().mapToInt(x->x.getSalary().intValue()).average();
		List<Employee> list2 = emp.stream().filter(x->x.getSalary()>average2.getAsDouble()).toList();
		System.out.println(list2);
	}
	

}
