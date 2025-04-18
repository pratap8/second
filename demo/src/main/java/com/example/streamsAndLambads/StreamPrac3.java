package com.example.streamsAndLambads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.util.comparator.Comparators;

import com.example.interview.Employee;

public class StreamPrac3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		String str = "Pratap";
//		String string = str.chars().mapToObj(c->String.valueOf((char)c)).reduce("", (a,b)->b+a);
//		System.out.println(string);
        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
//		Optional<Integer> max = numbers.stream().max(Comparators.comparable());
//		System.out.println(max);
//		Q. Find the longest string in a list of strings using Java streams:
		List<String> strings = Arrays
	              .asList("apple", "banana", "grapefruit", "date", "cherry");		
		Optional<String> max = strings.stream().max(Comparators.comparable());
//		System.out.println(max);
		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35)
			);
//		Q. Calculate the average age of a list of Person objects using Java streams:
		OptionalDouble average = persons.stream().mapToInt(Person::getAge).average();
//		System.out.println(average);

//		Q. Check if a list of integers contains a prime number using Java streams:
		
//		 numbers.stream() .filter(StreamPrac3::isPrime) // Use a method reference for filtering
//         .forEach(System.out::println);
//		 Q. Merge two sorted lists into a single sorted list using Java streams:
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
		 List<Integer> collect = Stream.of(list1,list2).flatMap(List::stream).collect(Collectors.toList());
//		 System.out.println(collect);
//		 Q. Find the intersection of two lists using Java streams:
		 List<Integer> collect2 = list1.stream().filter(list2::contains).collect(Collectors.toList());
//		 System.out.println(collect2);
//		 Remove duplicates from a list while preserving the order using Java streams:
		 HashSet hashSet = new HashSet();
		 List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
		 List<Integer> collect3 = numbersWithDuplicates.stream().filter(x->hashSet.add(x)).collect(Collectors.toList());
//		 System.out.println(collect3);
		 
		 List<Integer> collect4 = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
//		 System.out.println(collect4);
//		 Q. Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
		 List<Transaction> transactions = Arrays.asList(
				    new Transaction("2022-01-01", 100),
				    new Transaction("2022-01-01", 200),
				    new Transaction("2022-01-02", 300),
				    new Transaction("2022-01-02", 400),
				    new Transaction("2022-01-03", 500)
				);
		 int sum = transactions.stream().mapToInt(Transaction::getAmount).sum();
//		 System.out.println(sum);
		 Map<String, Integer> collect5 = transactions.stream().collect(Collectors.groupingBy(Transaction::getDate,Collectors.summingInt(Transaction::getAmount)));
//		 System.out.println(collect5);
//		 Q. Find the kth smallest element in an array using Java streams:
		 int[] array = {4, 2, 7, 1, 5, 3, 6};
		 int k = 3; // Find the 3rd smallest element
		 OptionalInt max2 = Arrays.stream(array).sorted().skip(k-1).findFirst();
//		 System.out.println(max2);
//		 Q. Given a list of strings, find the frequency of each word using Java streams:

		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", 
                     "banana", "apple");
		Map<String, Long> collect6 = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));	 
//		System.out.println(collect6);

//		Q. Implement a method to partition a list into two groups based on a predicate using Java streams:
		
		List<Integer> numbersOdd = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		Map<Boolean, List<Integer>> collect7 = numbersOdd.stream().collect(Collectors.partitioningBy(x->x%2==0));
		Map<Boolean, List<Integer>> collect7 = numbersOdd.stream().collect(Collectors.partitioningBy(x->x%2==0));
		List<Integer> even = collect7.get(true);
		List<Integer> odd = collect7.get(false);
//		System.out.println(even+" "+odd);
//		Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,8,15,49);
        List<Integer> collect8 = list.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println(collect8);
        Map<Boolean, List<Integer>> collect9 = list.stream().collect(Collectors.partitioningBy(x->x%2==0));
//        System.out.println(collect9.get(false));
        
//        2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<String> collect10 = list.stream().map(x->x+"").filter(x->x.startsWith("1")).collect(Collectors.toList());
//        System.out.println(collect10);
//        3. How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> collect11 = list.stream().filter(x->hashSet.add(x)).collect(Collectors.toList());
//        System.out.println(collect11);
//        list.stream().distinct().forEach(System.out::println);
//        4. Given the list of integers, find the first element of the list using Stream functions?
        Integer orElse = list.stream().findFirst().orElse(0);
//        System.out.println(orElse);
//        5. Given a list of integers, find the total number of elements present in the list using Stream functions?

        long sum2 = list.stream().count();
//        System.out.println(sum2);
//        6. Given a list of integers, find the maximum value element present in it using Stream functions?
        OptionalInt max3 = list.stream().mapToInt(x->x).max();
//        System.out.println(max3);
        int integer = list.stream().max(Integer::compare).get();
//        System.out.println(integer);
//        7. Given a String, find the first non-repeated character in it using Stream functions?
        String input = "Java articles are Awesome";
        Optional<Character> findFirst = input.chars().mapToObj(c->(char)c).filter(x->input.indexOf(x)==input.lastIndexOf(x)).findFirst();
//        System.out.println(findFirst);
//        8. Given a String, find the first repeated character in it using Stream functions?
        Optional<Character> findFirst2 = input.chars().mapToObj(x->(char)x).filter(ch->input.indexOf(ch)!=input.lastIndexOf(ch)).findFirst();
//        System.out.println(findFirst2);
        //Find Second highest salary of employee
        List<Employee> emp = Arrays.asList(new Employee("a", "m", 12d, "it"),new Employee("a", "m", 13d, "it"),
        		new Employee("a", "m", 14d, "it"),new Employee("a", "m", 11d, "it"),new Employee("a", "m", 12d, "it"));
        Optional<Employee> skip = emp.stream().distinct().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(skip);


	}
	static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		return IntStream.rangeClosed(2, (int)Math.sqrt(num)).allMatch(n->num%n!=0);
	}
}
