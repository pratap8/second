package com.example.streamsAndLambads;

import java.util.Arrays;
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


public class StreamPrac1 {

	public static void main(String[] args) {
//		Q. Find the longest string in a list of strings using Java streams:

		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
		Optional<String> max = strings.stream().max((a,b)->Integer.compare(a.length(), b.length()));
		strings.stream().max(Comparator.comparingInt(String::length));
//		System.out.println(max);
//		Q. Calculate the average age of a list of Person objects using Java streams:
		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35)
			);
		Double collect = persons.stream().collect(Collectors.averagingInt(Person::getAge));
		double average = persons.stream().mapToInt(Person::getAge).average().orElse(0);
		
//		System.out.println(average);
//		Q. Check if a list of integers contains a prime number using Java streams:
		  List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
//		  numbers.stream()
//          .anyMatch(this::isPrime);
//		  Remove duplicates from a list while preserving the order using Java streams:
		  List<Integer> numbersWithDuplicates = Arrays.asList(1, 5, 2, 3, 2, 4, 1, 5, 6, 5);
		  LinkedHashSet<Integer> value = new LinkedHashSet<Integer>();
		  List<Integer> collect2 = numbersWithDuplicates.stream().filter(x->value.add(x)).collect(Collectors.toList());
//		  System.out.println(collect2);
		  List<Integer> collect3 = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
//		  System.out.println(collect3);
//		  Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
		  List<Transaction> transactions = Arrays.asList(
				    new Transaction("2022-01-01", 100),
				    new Transaction("2022-01-01", 200),
				    new Transaction("2022-01-02", 300),
				    new Transaction("2022-01-02", 400),
				    new Transaction("2022-01-03", 500)
				);
//		  Map<String, Integer> collect4 = transactions.stream().collect(Collectors.groupingBy(Transaction::getDate,Collectors.summingInt(Transaction::getAmount)));
		  transactions.stream().collect(Collectors.groupingBy(Transaction::getDate,Collectors.summingInt(Transaction::getAmount)));
//		  System.out.println(collect4);
		  Optional<Integer> min = numbersWithDuplicates.stream().min(Comparator.comparingInt(Integer::intValue));
//		  System.out.println(min);
//		  Q. Find the kth smallest element in an array using Java streams:
		  int[] array = {4, 2, 7, 1, 5, 3, 6};
		  OptionalInt findFirst = Arrays.stream(array).sorted().findFirst();
//		  System.out.println(findFirst);
//		  Given a list of strings, find the frequency of each word using Java streams:
		  List<String> words = Arrays.asList("apple", "banana", "apple", "cherry","banana", "apple");
		  Map<String, Long> collect4 = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));  
//		  System.out.println(collect4);
		  String str="Pratap";
		  Map<Character, Long> collect5 = str.chars().map(Character::toLowerCase).mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		  System.out.println(collect5);
		  Map<Boolean, List<Integer>> collect6 = numbers.stream().collect(Collectors.partitioningBy(x->x%2==0));
		  List<Integer> even = collect6.get(true);
		  List<Integer> odd = collect6.get(false);
		  System.out.println(even+" "+odd);
		  
	}
}
class Transaction{
	String date;
	int amount;
	public Transaction(String date, int amount) {
		super();
		this.date = date;
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
abstract class Frank{
	abstract void writer();
}
