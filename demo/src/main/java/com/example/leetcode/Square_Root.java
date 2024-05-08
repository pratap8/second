package com.example.leetcode;

public class Square_Root {
	public static void main(String[] args) {
		SolutionSq solutionSq = new SolutionSq();
		System.out.println(solutionSq.mySqrt(9));
	}
}

class SolutionSq {
    public int mySqrt(int x) {
    	if (x == 0) {
            return 0;
        }
        int first = 1, last = x;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return last;
    }
}