package com.example.streamsAndLambads;

import java.security.Identity;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.util.comparator.Comparators;

import com.example.interview.Employee;


public class StreamPrac4 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35)
			);
		OptionalDouble average = persons.stream().mapToInt(x->x.getAge()).average();
		System.out.println(average);
		List<String> strings = Arrays
	              .asList("apple", "banana", "cherry", "date", "grapefruit","apple","apple","cherry");
		  List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
		  Optional<Integer> findFirst = numbers.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
//		  System.out.println(findFirst);
		  Map<String, Long> collect = strings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		  System.out.println(collect);
		  List<String> collect2 = strings.stream().filter(x->!x.equals("") || x!=null).collect(Collectors.toList());
//		  System.out.println(collect2);
		  List<String> collect3 = strings.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
//		  System.out.println(collect3);
		  List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		  Optional<Integer> sum = nums.stream().reduce((a,b)->a+b);
		  System.out.println(sum); // Output: 15
		  List<Employee> employees = Arrays.asList(
		            new Employee("Alice", "HR"),
		            new Employee("Bob", "IT"),
		            new Employee("Charlie", "HR"),
		            new Employee("David", "IT"),
		            new Employee("Eve", "Finance")
		        );
		  List<Student> students = Arrays.asList(
				    new Student("Alice", "A"),
				    new Student("Bob", "B"),
				    new Student("Charlie", "A"),
				    new Student("David", "C"),
				    new Student("Eve", "B")
				);
		  Map<String, List<Student>> collect4 = students.stream().sorted().collect(Collectors.groupingBy(Student::getGrade));
		  System.out.println(collect4);
	}
}
class Student {
    String name;
    String grade;

    // Constructor
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getter methods (optional, but useful)
    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
 // toString() method for easy printing
    @Override
    public String toString() {
        return name;
    }

}