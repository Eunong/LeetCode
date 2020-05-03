package com.lgalgol.leetcode.test300;

// 300. Longest Increasing Subsequence
public class Test300 {

	public static void main(String[] args) {
		System.out.println(lengthOfLIS(new int[] {10,9,2,5,3,4}));
		System.out.println(lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
	}

	public static int lengthOfLIS(int[] nums) {
		if(nums.length == 0) {
            return 0;
        }
        
        int[] dp = new int[nums.length];
		dp[0] = 1;
		
		int maxLIS = 1;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < i; j++) {
				if(nums[j] < nums[i]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				} else {
					dp[i] = Math.max(dp[i], 1);
				}
				maxLIS = Math.max(dp[i], maxLIS);
			}
		}
		
		return maxLIS;
	}
}
