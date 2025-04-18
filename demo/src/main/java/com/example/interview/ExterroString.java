package com.example.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

import org.apache.tomcat.util.buf.Ascii;

public class ExterroString {

	public static void main(String[] args) {
//		Output: Hello1 everyone2 my3 name4 is5 pratap6
		String aa="my3 everyone2 pratap6 is5 Hello1 name4";
		StringBuilder builder = new StringBuilder(aa);
		builder.reverse();
		String[] bb = builder.substring(0, aa.length()).split(" ");
		Arrays.sort(bb);
		StringBuilder builder1 = new StringBuilder();
		for(int i=0;i<bb.length;i++) {
			builder1.append(bb[i]+" ");
		}
		String[] cc = builder1.substring(0, aa.length()).split(" ");
		StringBuilder builder2 = new StringBuilder();
		for(int i=cc.length-1;i>=0;i--) {
			builder2.append(cc[i]+" ");
		}
		System.out.println(builder2.reverse().toString());
	}
}
