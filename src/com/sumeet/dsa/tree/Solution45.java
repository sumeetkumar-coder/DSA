package com.sumeet.dsa.tree;

import java.util.ArrayList;

public class Solution45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ArrayList<Integer> solve(TreeNode A, int B) {

	        ArrayList<Integer> l = find(A, B);
	        int size = l.size();

	        for (int i=0,j=size-1; i<size/2; i++,j--) {
	             int temp = l.get(i);
	             l.set(i,l.get(j));
	             l.set(j, temp);
	        }

	        return l;


	    }

	    public ArrayList<Integer> find(TreeNode A, int B) {


	         ArrayList<Integer> l = null;

	        if (A == null) {
	            return l;
	        } else if (A.val == B) {
	            l = new ArrayList<Integer>();
	            l.add(A.val);
	            return l;
	        }

	         ArrayList<Integer> left = find(A.left, B);
	         if (left != null) {
	             left.add(A.val);
	             return left;
	         }

	          ArrayList<Integer> right = find(A.right, B);
	         if (right != null) {
	             right.add(A.val);
	             return right;
	         }

	        return l;

	    }

}
