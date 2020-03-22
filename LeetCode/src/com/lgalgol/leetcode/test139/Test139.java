package com.lgalgol.leetcode.test139;

import java.util.ArrayList;
import java.util.List;

public class Test139 {

	public static void main(String[] args) {
//		List<String> list1 = new ArrayList<>();
//		list1.add("apple");
//		list1.add("pen");
//		System.out.println(wordBreak("applepenapple", list1));
		
		List<String> list2 = new ArrayList<>();
		list2.add("car");
		list2.add("ca");
		list2.add("rs");
		System.out.println(wordBreak("cars", list2));

	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		boolean dp[] = new boolean[s.length()+1];
		
		dp[0] = true;
		
		for(int i = 1; i <= s.length(); i++) { 
			for(int j = 0; j < i; j++) { 
//				System.out.println(i + ", " + j + " : " + s.substring(j, i));
				if(dp[j] && wordDict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
//			System.out.println("[" + i + "] : " + dp[i]);
		}
		
		return dp[s.length()];
	}
}
