package com.lgalgol.leetcode.test434;

// 434. Number of Segments in a String
public class Test434 {

	public static void main(String[] args) {
		System.out.println(countSegments("Hello, my name is John"));
		System.out.println(countSegments(""));
		System.out.println(countSegments(", , , ,        a, eaefa"));
	}

	public static int countSegments(String s) {
		if(s.length() < 1) {
            return 0;
        }
		
		int cnt = 0;
		
		String[] segment = s.split(" ");

		for(String ss : segment) {
			if(ss.replace(" ", "").length() > 0) {
				cnt++;
			}
		}
		
		return cnt;
	}

}
