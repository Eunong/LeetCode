package com.lgalgol.leetcode.test414;

// 414. Third Maximum Number
public class Test414 {

	public static void main(String[] args) {
		System.out.println(thirdMax(new int[]{-2147483648,-2147483648,-2147483648,-2147483648,1,1,1}));
		System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
		System.out.println(thirdMax(new int[]{2, 2, 4, 3, 5}));
		System.out.println(thirdMax(new int[]{1, 2}));
		System.out.println(thirdMax(new int[]{1, 1, 2}));
		System.out.println(thirdMax(new int[]{1, 2, -2147483648}));
	}

	public static int thirdMax(int[] nums) {
		Integer maxFirst  = null;
		Integer maxSecond = null;
		Integer maxThird  = null;
		
		for(int n : nums) {
			if(Integer.valueOf(n).equals(maxFirst) || Integer.valueOf(n).equals(maxSecond) || Integer.valueOf(n).equals(maxThird)) {
				continue;
			}
			
			if(maxFirst == null || n > maxFirst) {
				maxThird  = maxSecond;
				maxSecond = maxFirst;
				maxFirst  = n;
			} else if(maxSecond == null || n > maxSecond) {
				maxThird  = maxSecond;
				maxSecond = n;
			} else if(maxThird == null || n > maxThird) {
				maxThird  = n;
			}
		}
		return (maxThird == null) ? maxFirst : maxThird;
	}

}
