package com.example.leetcode;

import java.util.Arrays;

public class Majority_Element {

	public static void main(String[] args) {
		SolutionA solution = new SolutionA();
		int[] a= {2,2,1,1,1,2,2};
		solution.majorityElement(a);
//		System.out.println(solution.singleNumber(a));
	}

}
class SolutionA {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}