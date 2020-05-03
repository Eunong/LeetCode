package com.lgalgol.leetcode.test412;

import java.util.ArrayList;
import java.util.List;

// 412. Fizz Buzz
public class Test412 {

	public static void main(String[] args) {
		fizzBuzz(15);
	}

	public static List<String> fizzBuzz(int n) {
		List<String> rslt = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			if(i%3==0 && i%5==0) {
				rslt.add("FizzBuzz");
			} else if(i%3==0) {
				rslt.add("Fizz");
			} else if(i%5==0) {
				rslt.add("Buzz");
			} else {
				rslt.add(i+"");
			}
		}
		
		return rslt;
	}
}
