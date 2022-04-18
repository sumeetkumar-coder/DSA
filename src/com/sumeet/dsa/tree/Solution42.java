package com.sumeet.dsa.tree;

public class Solution42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int isSymmetric(TreeNode A) {

	        if (isSame(A, A)) {
	            return 1;
	        }
	        return 0;
	    }

	    public boolean isSame(TreeNode A, TreeNode B) {

	        if (A == null && B == null) {
	            return true;
	        }

	        if (A != null && B != null && A.val == B.val) {
	            return  (isSame(A.left,B.right) && isSame(A.right,B.left));
	        }

	        return false;

	    }

}
