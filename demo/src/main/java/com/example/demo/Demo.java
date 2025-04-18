package com.example.demo;


import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class Demo {
	String s="pratap";
	public static void main(String args[])
	{
//		Demo demo = new Demo();
//		Scanner scanner = new Scanner(System.in);
//		int base = scanner.nextInt();
//		int power =  scanner.nextInt();
//		demo.printVal(base,power);
//		List<Integer> bb= Arrays.asList(1,3,234,234,43,342,65,56,345,456,57,2);
//		bb.stream().max((Comparator<? super Integer>) Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		Optional<Integer> reduce = bb.stream().reduce(Integer::max);
//		int sum = bb.parallelStream()
//                .reduce(0,
//                        (a, b) -> a + b,
//                        (a, b) -> a + b); // Combiner for 
//		Optional<Integer> reduce2 = bb.stream().reduce(Integer::min);
//		reduce.ifPresent(value->System.out.println(value));
//		System.out.println(reduce2);
//		System.out.println(sum);
//		int a=15;
//		a= a >>> 3;
//		String c = new String("aa");
		
//		String a="aa";
//		String b="aa";
//		System.out.println(a==c);
//		String word="afhtgpque";
//		int[] letterFrequency = new int[26];
//        for (char c : word.toCharArray()) {
//            letterFrequency[c - 'a']++;
//        }
//       for(int aa:letterFrequency) {
//    	   System.out.println(aa);
//       }
//       String str ="3[b2[ca]]";
//       System.out.println(str);
		
//		List<Integer> arr =Arrays.asList(1,2,3,4,5,6);
		
//		List<Integer> collect = arr.stream().map(x->x*2).collect(Collectors.toList());
//		System.out.println(collect);
//		System.out.println(countSubstrings("bef"));
//		int[] aa = {1,2,3,4,5};
//		int[] bb=new int[aa.length];
//		bb=aa;
//		bb[2]=10;
//		for(int cc:bb) {
//			System.out.println(cc);
//		}
		long arr = 1_20_22;
		int like = 1234;
		System.out.println(like*2);
	}
	public void namer() {
		
	}
//	void printVal(int base,int power) {
//		int numb=base;
//		for(int i=1;i<power;i++) {
//			numb*=base;
//		}
//		System.out.println(Math.pow(base, power));
//		int baseless = IntStream.range(0, numb).map(i->base).reduce(1, (a,b)->a*b);
//		System.out.println(numb);
	
//	}
	 private static int getMapped(char c) {
	        return c - 'a' + 1; // Maps a=1, b=2, ..., z=26
	    }

	    public static int countSubstrings(String input_str) {
	        int count = 0;
	        int n = input_str.length();

	        for (int i = 0; i < n; i++) {
	            int sum = 0;
	            for (int j = i; j < n; j++) {
	                sum += getMapped(input_str.charAt(j));
	                int length = j - i + 1;

	                // Debugging Print Statement (Remove after debugging)
	                System.out.println("Substring: " + input_str.substring(i, j + 1) + ", Sum: " + sum + ", Length: " + length + ", Sum % Length: " + (sum % length));

	                if (sum % length == 0) {
	                    count++;
	                }
	            }
	        }

	        return count;
    }
}
