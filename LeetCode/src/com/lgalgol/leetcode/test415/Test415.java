package com.lgalgol.leetcode.test415;

// 415. Add Strings
public class Test415 {

	public static void main(String[] args) {
//		System.out.println(addStrings("12", "239"));
		System.out.println(addStrings("584", "18"));
	}

	public static String addStrings(String num1, String num2) {
		int i = num1.length()-1;
		int j = num2.length()-1;

		char[] n1 = num1.toCharArray();
		char[] n2 = num2.toCharArray();

		int carry = 0;
		
		StringBuilder sb = new StringBuilder();
		
		while(i>=0 || j>=0 || carry > 0) {
			int a = 0;
			int b = 0;

			if(i >= 0) {
				a = n1[i--] - '0';
			}

			if(j >= 0) {
				b = n2[j--] - '0';
			}
			
			sb.insert(0, (a+b+carry)%10);
//			System.out.println("sb : " + sb);
			carry = (a+b+carry)/10;
//			System.out.println("carry : " + carry);
		}
		
		return sb.toString();
	}
}
