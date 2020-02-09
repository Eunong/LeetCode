package com.lgalgol.leetcode.test268;

public class Test268 {

	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};

		System.out.println(missingNumber(nums));
//		System.out.println(9^0);
	}

	public static int missingNumber(int[] nums) {
		int tmp = 0;
		
		for(int i = 0; i < nums.length; i++) {
			tmp ^= i ^ nums[i];
		}
		
		return tmp^nums.length;
		
	}

}
