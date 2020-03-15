package com.lgalgol.leetcode.test350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test350 {

	public static void main(String[] args) {
		intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
		intersect(new int[]{1, 2, 2, 1}, new int[]{2});
		intersect(new int[]{2, 1, 2, 2, 1}, new int[]{2, 3, 2, 2});
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> rsltList = new ArrayList<>();
		
		for(int n1 : nums1) {
			int get = map.getOrDefault(n1, 0);
			map.put(n1, get + 1);
		}
		
		for(int n2 : nums2) {
			if(map.get(n2) != null && map.get(n2) > 0) {
				rsltList.add(n2);
				map.put(n2, map.get(n2)-1);
			}
		}
		
		int[] rslt = new int[rsltList.size()];
		for(int i = 0; i < rslt.length; i++) {
			rslt[i] = rsltList.get(i);
		}
		
		System.out.println(rsltList);
		System.out.println(map);
		
		return rslt;
	}
}
