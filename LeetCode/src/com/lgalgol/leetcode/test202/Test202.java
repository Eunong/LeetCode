package com.lgalgol.leetcode.test202;

import java.util.HashSet;
import java.util.Set;

public class Test202 {

	public static void main(String[] args) {
		System.out.println(isHappy(18));
		
		
	}

	public static boolean isHappy(int n) {
		Set set = new HashSet();
		
		while(set.add(n)) {
			int sum = 0;
			while(n != 0) { // 한자리씩 잘라서 계산
				System.out.println(n%10);
				
				sum += (n%10)*(n%10);
				n/=10;
			}
			
			System.out.println("sum : " + sum);
			n = sum;
			if(n == 1) {
				return true;
			}
		}
		
		return false;
	}
	
//	public static boolean isHappy(int n) {
//	    Set<Integer> inLoop = new HashSet<Integer>();
//	    int squareSum,remain;
//		while (inLoop.add(n)) {
//			squareSum = 0;
//			while (n > 0) {
//			    remain = n%10;
//				squareSum += remain*remain;
//				n /= 10;
//			}
//			if (squareSum == 1)
//				return true;
//			else {
//				n = squareSum;
//				System.out.println("n : " + n);
//			}
//
//		}
//		return false;
//	}
	
//	public static boolean isHappy(int n) {
//        int x = n;
//        int y = n;
//        while(x>1){
//            x = cal(x) ; // 82
//            if(x==1) return true ;
//            y = cal(cal(y));
//            
//            System.out.println("x : " + x);
//            System.out.println("y: " + y);
//            if(y==1) return true ;
//
//            if(x==y) return false;
//        }
//        return true ;
//    }
//    public static int cal(int n){
//        int x = n;
//        int s = 0;
//        while(x>0){
//            s = s+(x%10)*(x%10);
//            x = x/10;
//        }
//        return s ;
//    }
}
