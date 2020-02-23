package com.lgalgol.leetcode.test91;

public class Test91 {

	public static void main(String[] args) {
		System.out.println(numDecodings("00"));
		System.out.println(numDecodings("01"));
		System.out.println(numDecodings("12"));
		System.out.println(numDecodings("226"));
		System.out.println(numDecodings("227"));
	}

	public static int numDecodings(String s) {
		int len = s.length();

		int[] dp = new int[len + 1];

		dp[0] = 1;
		dp[1] = s.charAt(0) != '0' ? 1 : 0;

		for (int i = 2; i <= len; i++) {
			if(s.charAt(i-1) != '0') {
				dp[i] += dp[i-1];
			}
			if(Integer.parseInt(s.substring(i-2, i)) > 9 && Integer.parseInt(s.substring(i-2, i)) < 27) {
				dp[i] += dp[i-2];
			}
		}
		return dp[len];
	}
}
