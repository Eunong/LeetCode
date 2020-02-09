package com.lgalgol.leetcode.test290;

import java.util.HashMap;
import java.util.Map;

public class Test290 {

	public static void main(String[] args) {
		System.out.println(wordPattern("aaa", "aa aa aa aa"));
		System.out.println(wordPattern("abba", "dog cat cat dog"));
		System.out.println(wordPattern("abba", "dog cat cat fish"));
		System.out.println(wordPattern("abba", "dog dog dog dog"));
	}

	public static boolean wordPattern(String pattern, String str) {
		String[] strs = str.split(" ");
		
		if(pattern.length() != strs.length) {
			return false;
		}
		
		Map patternMap = new HashMap();
		
		for(int i = 0; i < strs.length; i++) {
			char key = pattern.charAt(i);
			
			if(patternMap.get(key) == null) { // 처음 패턴 등장
				if(patternMap.containsValue(strs[i])) {
					return false;
				}
				patternMap.put(key, strs[i]);
			} else { // 기 존재하는 패턴이면 동일한지 확인
				if(!patternMap.get(key).equals(strs[i])) {
					return false;
				}
			}
		}
		
		return true;
		
//		String[] words = str.split(" ");
//      if (words.length != pattern.length()) {
//      	return false;
//      }
//      Map index = new HashMap();
//      for (Integer i=0; i<words.length; ++i) {
//      	if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) {
//      		return false;
//      	}
//      		
//      }
//      return true;
	}
}
