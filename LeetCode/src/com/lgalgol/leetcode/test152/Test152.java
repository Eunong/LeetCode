package com.lgalgol.leetcode.test152;

public class Test152 {

	public static void main(String[] args) {
		System.out.println(maxProduct(new int[] {2, 3, -2, 4, 2}));
		System.out.println(maxProduct(new int[] {-2, 0, -1}));
		System.out.println(maxProduct(new int[] {-2, 3, -4}));
	}

	public static int maxProduct(int[] nums) {
		int rslt = nums[0];
		int min  = nums[0];
		int max  = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			int tmp = max;
			
			max = Math.max(Math.max(min*nums[i], max*nums[i]), nums[i]);
			min = Math.min(Math.min(min*nums[i], tmp*nums[i]), nums[i]);

			if(max > rslt) {
				rslt = max;
			}
		}
		
		return rslt;
		
		// time limit exceeded
//		int[] arr = new int[nums.length];
//		
//		for(int i = 0; i < nums.length; i++) {
//			arr[i] = nums[i];
//			for(int j = i+1; j < nums.length; j++) {
//				int mul = 1;
//				for(int k = i; k <= j; k++) {
//					mul *= nums[k];
//				}
//				if(mul > arr[i]) {
//					arr[i] = mul;
//				}
//			}
//		}
//		Arrays.sort(arr);
//		return arr[arr.length-1];
	}

}
