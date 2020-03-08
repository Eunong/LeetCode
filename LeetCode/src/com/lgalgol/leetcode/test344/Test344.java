package com.lgalgol.leetcode.test344;

import java.util.Arrays;

public class Test344 {

	// 344. Reverse String
	public static void main(String[] args) {
		reverseString(new char[] {'h','e','l','l','o'});
	}

	public static void reverseString(char[] s) {
		char[] copyS = Arrays.copyOf(s, s.length);
		
		for(int i = 0; i < s.length/2; i++) {
			s[i] = copyS[s.length-i-1];
			s[s.length-i-1] = copyS[i];
		}
		
//		int left  = 0;
//		int right = s.length - 1;
//		
//		while(left < right) {
//			char c = s[left];
//			s[left] = s[right];
//			s[right] = c;
//			
//			left++;
//			right--;
//		}
	}

}
