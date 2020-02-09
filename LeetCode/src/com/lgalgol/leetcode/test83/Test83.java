package com.lgalgol.leetcode.test83;

public class Test83 {

	public static void main(String[] args) {
		// 1->1->2->3->3
		// 1->1->2
//		System.out.println(deleteDuplicates(head));
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null) {
			return null;
		}
		
		ListNode curNode = head;

		ListNode goNode = head.next;
		
		while (goNode != null) {
			if(curNode.val != goNode.val) {
				curNode.next = goNode;
				curNode = curNode.next;
			}
			goNode = goNode.next;
		}
		
		curNode.next = null;
		
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}