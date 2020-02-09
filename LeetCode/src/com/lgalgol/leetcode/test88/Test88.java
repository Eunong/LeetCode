package com.lgalgol.leetcode.test88;

public class Test88 {

	public static void main(String[] args) {
//		int[] nums1 = {4,5,6,0,0,0};
//		int m = 3;
//		int[] nums2 = {1,2,3};
//		int n = 3;
		
		int[] nums1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int m = 0;
		int[] nums2 = {-50,-50,-48,-47,-44,-44,-37,-35,-35,-32,-32,-31,-29,-29,-28,-26,-24,-23,-23,-21,-20,-19,-17,-15,-14,-12,-12,-11,-10,-9,-8,-5,-2,-2,1,1,3,4,4,7,7,7,9,10,11,12,14,16,17,18,21,21,24,31,33,34,35,36,41,41,46,48,48};
		int n = 63;
		merge(nums1, m, nums2, n);
		
		for(int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(n < 1) {
			return;
		}
		
		if(m < 1) {
			for(int idx = nums1.length-1 ; idx >= 0; idx--) {
				nums1[idx] = nums2[--n];
			}
			return;
		}
		
		m = m < 1 ? m : m-1;
		n = n < 1 ? n : n-1;
		
		for(int idx = nums1.length-1 ; idx >= 0; idx--) {
			if(m < 0) {
				nums1[idx] = nums2[n--];
				continue;
			}
			
			if(nums1[m] > nums2[n]) {
				nums1[idx] = nums1[m--];
			} else {
				nums1[idx] = nums2[n--];
			}
			
			if(n < 0) {
				break;
			}
		}
	}
}
