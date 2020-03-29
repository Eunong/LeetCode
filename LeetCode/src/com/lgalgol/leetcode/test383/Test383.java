package com.lgalgol.leetcode.test383;

import java.util.ArrayList;
import java.util.List;

public class Test383 {

	public static void main(String[] args) {
		System.out.println(canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
	}
	

	public static boolean canConstruct(String ransomNote, String magazine) {
		List<Character> list = new ArrayList<>();
		for(int i = 0; i < magazine.length(); i++) {
			list.add(magazine.charAt(i));
		}
		
		int idx = 0;
		
		for(int i = 0; i < ransomNote.length(); i++) {
			idx = list.indexOf(ransomNote.charAt(i));
			if(idx == -1) {
				return false;
			}
			list.remove(idx);
		}
		
        return true;
        
        // other's solution
//		int[] arr = new int[26];
//        for (int i = 0; i < magazine.length(); i++) {
//            arr[magazine.charAt(i) - 'a']++;
//        }
//        for(int i = 0; i < arr.length; i++) {
//        	System.out.println();
//        }
//        for (int i = 0; i < ransomNote.length(); i++) {
//            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
//                return false;
//            }
//        }
//        return true;
        
    }
}
