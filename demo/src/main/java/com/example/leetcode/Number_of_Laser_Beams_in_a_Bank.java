package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Number_of_Laser_Beams_in_a_Bank {

	public static void main(String[] args) {
		SolutionBank bank = new SolutionBank();
		String[] a={"1","1"};
		System.out.println(bank.numberOfBeams(a));
	}
}

class SolutionBank {
    public int numberOfBeams(String[] bank) {
    	int a=0;
    	int b=0;
    	long counti=0;
    	long countj=0;
		for(int i=0;i<bank.length;i++) {
		
			for(int j=i+1;j<bank.length;j++) {
				if(bank[i].contains("1") && bank[j].contains("1")) {
					counti = bank[i].chars().filter(x->x=='1').count();
					countj = bank[j].chars().filter(x->x=='1').count();
					b = (int) ((int) counti*countj)+b;
					System.out.println(b);
					a++;
					break;
				}
			}	
		}		
		return b;
    }
}