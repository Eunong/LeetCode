package com.lgalgol.leetcode.test108;

public class Test108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums == null || nums.length == 0) {
			return null;
		}
        return createBST(nums, 0, nums.length-1);
    }
	
	public static TreeNode createBST(int[] nums, int l, int r) {
		// 입력된 숫자가 1개이면 바로 노드 생성하고 return
		if(l == r) { 
			return new TreeNode(nums[l]);
		}
		
		int m = l + (r - l) / 2;
		
		TreeNode root = new TreeNode(nums[m]);
		
		if(l == m) {
			root.right = new TreeNode(nums[r]);
		} else {
			root.left = createBST(nums, l, m-1);
			root.right = createBST(nums, m+1, r);
		}
		
		return root;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}