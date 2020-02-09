package com.lgalgol.leetcode.test141;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test141 {

//	public static void main(String[] args) {
//		String str1 = "aabbbcaaa";
//		String str2 = "abc";
//		
//		System.out.println(str1 + " 압축 => " + getCompressStr(str1)); // a2b3c1a3
//		System.out.println(str2 + " 압축 => " + getCompressStr(str1)); // abc
//	}
//	
//	public static String getCompressStr(String str) {
//		String result = "";
//		
//		
//		return result;
//	}
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("GOOD", "ABC", "BYE", "ABC", "GOOD", "GOOD");
		System.out.println(getRslt(strList)); // [GOOD=3, ABC=2, BYE=1]
	}
	
	public static List<String> getRslt(List<String> inputStr) {
		List<String> result = new ArrayList<String>();
		// 구현
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String str : inputStr) {
			if(map.get(str) == null) {
				map.put(str, 1);
			} else {
				map.put(str, map.get(str) + 1);
			}
		}
		
		for(String key : map.keySet()) {
			result.add(key + "=" + map.get(key));
		}
		
		return result;
	}

}
