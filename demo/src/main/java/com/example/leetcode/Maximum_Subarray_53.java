package com.example.leetcode;

public class Maximum_Subarray_53 {

	public static void main(String[] args) {
		NormalAlgo algo = new NormalAlgo();
		KadaneAlgo kadaneAlgo = new KadaneAlgo();
		KadaneAlgo1 algo1 = new KadaneAlgo1();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(algo1.maxSubArray(nums ));
	}
}

class NormalAlgo{
	 public int maxSubArray(int[] nums) {
	        int x=0;
	        int high=-10000000;
	        
	        for(int i=0;i<nums.length;i++){
	            x=0;
	            for(int j=i;j<nums.length;j++){
	                x=nums[j]+x;
	                if(x>high){
	                    high=x;
	                }
	            }
	        }
	        return high;
	    }
}
class KadaneAlgo{
	public int maxSubArray(int[] nums) {
		int max= Integer.MIN_VALUE, sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			max=Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return max;
    }
}

class KadaneAlgo1{
	public int maxSubArray(int[] nums) {
//		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

		int max= Integer.MIN_VALUE, sum=nums[0];
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			if(sum>max) {
				max=sum;
			}
			System.out.println(sum+"         ---             "+nums[i]+"            --       "+max);

			if(sum<0) {
				sum=0;
			}
		}
		return max;
    }
}