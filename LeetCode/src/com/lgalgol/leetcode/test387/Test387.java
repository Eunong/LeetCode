package com.lgalgol.leetcode.test387;

public class Test387 {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode")); // 0
		System.out.println(firstUniqChar("loveleetcode")); // 2
		System.out.println(firstUniqChar("aa")); // -1
		System.out.println(firstUniqChar("a")); // 0
		System.out.println(firstUniqChar("aadadaad")); // -1
	}

	public static int firstUniqChar(String s) {
		int[] arr = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)-'a']++;
		}
		for(int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i)-'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

}
