package com.example.demo.Set;

import java.util.*;

public class SetPrac {

	public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();

        a.add(3);
        a.add(2);
        a.add(2);
        a.add(9);
        a.add(10);
        a.add(9);
        a.add(5);
        System.out.println(a.size());
       for(int i: a) {
//    	   System.out.println(i);
       }

	}
}
