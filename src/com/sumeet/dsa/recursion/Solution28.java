package com.sumeet.dsa.recursion;

/*
 * Write a recursive function that checks whether string A is a palindrome or Not.
 * 
 */

public class Solution28 {

	public static void main(String[] args) {

		

	}
	
	 public int solve(String A) {

	        if (isPallindrom(A, 0, A.length()-1)) {
	            return 1;
	        }

	        return 0;

	    }

	    public boolean isPallindrom(String A, int startIndex, int endIndex) {

	            if(startIndex == endIndex || startIndex > endIndex) {
	                return true;
	            }

	            if(A.charAt(startIndex) == A.charAt(endIndex)) {
	                return isPallindrom(A, ++startIndex, --endIndex);
	            } else {
	                return false;
	            }
	    }

}
