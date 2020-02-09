package com.lgalgol.leetcode.test225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Test225 {

	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<>();
//		stack.push(1);
//		stack.push(2);
//		stack.peek();
//		
//		stack.remove(0);
//		
//		System.out.println(stack);
//		int first = stack.firstElement();
//		System.out.println(first);
////		Queue<Integer> queue = new Queue<>();
//		
//		System.out.println(stack.size());
		
		Queue<Integer>queue = new LinkedList<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		String s = "asdf";
		char c1[] = s.toCharArray();
		Arrays.sort(c1);
		
		Object[] a = queue.toArray();
		
		System.out.println((Integer)a[queue.size()-1]);
		while(queue.size() > 1) {
			System.out.println("peek : " + queue.poll());
		}
		System.out.println(queue.peek());
		
		System.out.println(queue);
	}

}
