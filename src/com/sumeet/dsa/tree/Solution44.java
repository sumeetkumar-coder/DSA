package com.sumeet.dsa.tree;

public class Solution44 {

	public static void main(String[] args) {

		

	}
	
	 public TreeNode invertTree(TreeNode A) {

	        if (A == null) {
	            return A;
	        }

	        TreeNode temp = A.left;
	        A.left = A.right;
	        A.right = temp;

	        invertTree(A.left);
	        invertTree(A.right);

	        return A;

	    }

}
