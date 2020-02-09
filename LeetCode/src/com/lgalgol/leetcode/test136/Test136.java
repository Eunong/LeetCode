package com.lgalgol.leetcode.test136;

import java.util.HashMap;
import java.util.Map;

public class Test136 {

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
		// case 1.
//		Set set = new HashSet();
//		
//		int uniqSum = 0;
//		int numsSum = 0;
//		
//		for(int n : nums) {
//			set.add(n);
//			numsSum += n;
//		}
//		
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			uniqSum += (Integer)it.next();
//		}
//		
//		return uniqSum*2 - numsSum;
		
		// casae 2.
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int n : nums) {
			map.put(n, (map.get(n)) == null ? 1 : map.get(n) + 1);
		}
		
		for(int key : map.keySet()) {
			if(map.get(key) == 1) {
				return key;
			}
		}
		
		return 0;
		
		// case 3.
//		int a = 0;
//		for(int n : nums) {
//			a ^= n;
//		}
//		return a;
    }

}
