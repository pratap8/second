package com.example.leetcode;

public class Minimum_Amount_of_Time_to_Collect_Garbage {

	public static void main(String[] args) {
		SolutionGarbage garbage = new SolutionGarbage();
		String[] garbage1= {"MMM","PGM","GP"};
		int[] travel =  {3,10};
		System.out.println(garbage.garbageCollection(garbage1, travel));
	}
}

class SolutionGarbage {
    public int garbageCollection(String[] garbage, int[] travel) {
        int z=0;
        String [] l= {"M","P","G"};
        for(int i=0;i<garbage.length;i++){
            z+=garbage[i].length();
        }
        for(int i=0;i<l.length;i++) {
        	int x =0;
        	for(int j=1;j<garbage.length;j++) {
        		x+=travel[j-1];
        		if(garbage[j].contains(l[i])) {
            		z+=x;
            		x=0;
            	}
        	}
        }
    	return z;
    }
}