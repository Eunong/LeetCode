package com.lgalgol.leetcode.test349;

import java.util.HashSet;
import java.util.Set;

public class Test349 {

	// 349. Intersection of Two Arrays
	public static void main(String[] args) {
		System.out.println(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4}));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> intersects = new HashSet<Integer>();
		
		for(int n : nums1) {
			set.add(n);
		}
		
		for(int n : nums2) {
			if(set.contains(n)) {
				intersects.add(n);
			}
		}
		
		int[] rslt = new int[intersects.size()];
		int i = 0;
		
		for(int n : intersects) {
			rslt[i++] = n;
		}
		
		return rslt;
	}
}
