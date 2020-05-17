package com.lgalgol.leetcode.test443;

// 443. String Compression
public class Test443 {

	public static void main(String[] args) {
		System.out.println(compress(new char[] {'a','a','b','b','c','c','c'}));
	}

	public static int compress(char[] chars) {
		int idx = 0;
		int idxWrite = 0;
		
		for(int i = 0; i < chars.length; i++) {
			if(i+1 == chars.length || chars[i+1] != chars[i]) {
				chars[idxWrite] = chars[idx];
				idxWrite++;
				
				if(i > idx) {
					for(char c : ((i-idx+1)+"").toCharArray()) {
						chars[idxWrite++] = c;
					}
				}
				
				idx = i+1;
			}
		}
		
		return idxWrite;
	}

}
