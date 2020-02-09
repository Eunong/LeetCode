package com.lgalgol.leetcode.test205;

import java.util.HashMap;
import java.util.Map;

public class Test205 {

	public static void main(String[] args) {
		String s = "ab";
		String t = "aa";
		
		Map<Character, Character> map = new HashMap<>();
		
		
		for(int i = 0; i < s.length(); i++) {
			char charS = s.charAt(i);
			char charT = t.charAt(i);
			if(map.get(charS) == null) {
				if(!map.containsValue(charT)) {
					map.put(charS, charT);
				} else {
					System.out.println("false!!!");
				}
				
				
			} else {
				if(map.get(charS) != charT) {
					System.out.println("false!!!");
					break;
				}
			}
		}
		System.out.println(map);
	}

}
