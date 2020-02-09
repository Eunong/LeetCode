package com.lgalgol.leetcode.test219;

import java.util.HashMap;
import java.util.Map;

public class Test219 {

	public static void main(String[] args) {
		int[] nums = {1, 0, 1, 1};
		int k = 1;
		
		Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
            	map.put(nums[i], i);
            } else {
            	System.out.println("diff : " + (i - map.get(nums[i])));
            	if(i - map.get(nums[i]) <= k) {
            		System.out.println("true!!!");
            		break;
            	} else {
            		map.put(nums[i], i);
            	}
            	
            }
            System.out.println(map);
        }
	}

}
