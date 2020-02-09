package com.lgalgol.leetcode.test283;

public class Test283 {
	public static void main(String[] args) {
		moveZeroes(new int[] { 0, 1, 0, 3, 12 });
	}

	public static void moveZeroes(int[] nums) {
		
		int zeros = 0;
		int idx = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				zeros++;
			} else {
				nums[idx] = nums[i];
				idx++;
			}
		}
		
		for(int i = nums.length-zeros; i < nums.length; i++) {
			nums[i] = 0;
		}
		
		// print
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
