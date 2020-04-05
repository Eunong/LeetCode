package com.lgalgol.leetcode.test213;

// 213. House Robber II
public class Test213 {

	public static void main(String[] args) {
		// System.out.println(rob(new int[] { 2, 3, 2 }));
		// System.out.println(rob(new int[] { 1, 2, 3, 1 }));
		// System.out.println(rob(new int[] { 1, 2, 3, 1, 2, 1, 2 }));
		System.out.println(rob(new int[] { 1, 3, 1, 3, 100 }));
	}

	public static int rob(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
	}

	public static int rob(int[] nums, int lo, int hi) {
		int preRob = 0, preNotRob = 0, rob = 0, notRob = 0;
		
		for (int i = lo; i <= hi; i++) {
			rob    = preNotRob + nums[i];
			notRob = Math.max(preRob, preNotRob);

			preNotRob = notRob;
			preRob    = rob;
		}
		
		return Math.max(rob, notRob);
	}
	
}
