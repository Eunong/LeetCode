package com.lgalgol.leetcode.test303;

public class Test303 {

	public static void main(String[] args) {
		System.out.println(new NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(0, 2));
		System.out.println(new NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(2, 5));
		System.out.println(new NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(0, 5));
	}

}

class NumArray {
	private int[] numArray;
	
    public NumArray(int[] nums) {
        numArray = nums;
    }
    
    public int sumRange(int i, int j) {
        int sum = 0;
        
        for(int k = i; k <= j; k++) {
        	sum += numArray[k];
        }
        
        return sum;
    }
}