package com.sumeet.dsa.bit.manipulation;

/*
 * Given a binary string A. It is allowed to do at most one swap between any 0 and 1. 
 * Find and return the length of the longest consecutive 1’s that can be achieved.
 * 
 * 
 * 
 */

public class Solution19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve("1101001100101110"));
	}
	
	 public static int solve(String A) {

	        int max = 0;

	        for (int i=0; i<A.length() ; i++) {

	            if ((A.charAt(i) - '0') == 0) {
	            	
	                int left = 0;
	                int j = i;
	                while (j >= 1) {
	                    j--;
	                    if ((A.charAt(j) - '0') == 1) {
	                        left++;
	                    } else {
	                        break;
	                    }
	                }

	                int right = 0;
	                j = i;

	                 while (j < A.length()-1) {
	                    j++;
	                    if ((A.charAt(j) - '0') == 1) {
	                        right++;
	                    } else {
	                        break;
	                    }
	                }
	                 

	                 if ((left + right+1) > max) {
	                     if (left > 0 && right > 0) {
	                         max = left + right + 1;
	                     } else {
	                         max = left + right;
	                     }
	                     
	                 }


	            }

	        }
	        
	        if (max == 0) {
	            max = A.length();
	        }

	        return max;

	}
	
	

}
