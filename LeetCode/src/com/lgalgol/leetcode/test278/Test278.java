package com.lgalgol.leetcode.test278;

public class Test278 {

	public static void main(String[] args) {

	}
	/*
	public int firstBadVersion(int n) {
        // Time Limited
        // for(int i = 1; i <= n; i++) {
        //     if(isBadVersion(i)) {
        //         return i;
        //     }
        // }
        
        int left = 1; 
        int right = n;
        
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return right;
    }
    */
}
