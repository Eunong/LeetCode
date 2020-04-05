package com.lgalgol.leetcode.test389;

import java.util.Arrays;

// 389. Find the Difference
public class Test389 {

	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde"));
	}

	public static char findTheDifference(String s, String t) {
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		
		Arrays.sort(cs);
		Arrays.sort(ct);
		
		for(int i = 0; i < cs.length; i++) {
			if(cs[i] != ct[i]) {
				return ct[i];
			}
		}
		
		return ct[ct.length-1];
	}

}
