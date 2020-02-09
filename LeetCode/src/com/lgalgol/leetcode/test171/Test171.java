package com.lgalgol.leetcode.test171;

public class Test171 {

	public static void main(String[] args) {
		System.out.println(titleToNumber("A"));
	}
	
	public static int titleToNumber(String s) {
		s = "AB";
		
        int rslt = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	// A 65
            char c = s.charAt(i);
            System.out.println("c : " + c);
            while(c != 0) {
            	c--;  // 64
            	System.out.println("test : " + (i*26));
            	rslt += (i*25) + (c/64) + (c % 64); 
            	System.out.println("rslt : " + rslt);
            	c /= 65;
            }
            
        }
        
        
        return rslt;
    }
	
//	public static int titleToNumber(String s) {
//		s = "AA";
//		
//        int rslt = 0;
//        
//        // A 65
//        char c = s.charAt(0);
////        System.out.println((int)c);
//        
//        for(int i = 0; i < s.length(); i++) {
//        	
//        }
//        
//        while(c != 0) {
//        	c--; // 65
//        	
//        	rslt += (c/64) + (c % 64); 
//        	System.out.println("rslt : " + rslt);
//        	c /= 65;
//        }
//        
//        return rslt;
//    }
}
