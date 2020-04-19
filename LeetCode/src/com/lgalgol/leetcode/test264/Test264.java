package com.lgalgol.leetcode.test264;

// 264. Ugly Number II
public class Test264 {

	public static void main(String[] args) {
		System.out.println(nthUglyNumber(10));
	}

	public static int nthUglyNumber(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		int[] dp = new int[n];
		
		int n2 = 0;
		int n3 = 0;
		int n5 = 0;
		
		dp[0] = 1;
		
		int i = 1, min = 0;
		
	    while ( i < n ) {
	    	min = Math.min(dp[n2]*2, Math.min(dp[n3]*3, dp[n5]*5));
	    	if(min == dp[n2]*2) {
	    		n2++;
	    	}
	    	if(min == dp[n3]*3) {
	    		n3++;
	    	}
	    	if(min == dp[n5]*5) {
	    		n5++;
	    	}
	        dp[i] = min;
	     
	        i++;
	    }
	    return dp[n-1];
	}
}
