package com.sumeet.dsa.array;

public class Solution50 {

	public static void main(String[] args) {

		
	}
	
	 public int trap(final int[] A) {

	        int[] maxPrefix = new int[A.length];
	        int[] maxSuffix = new int[A.length];

	        int max = 0;

	        for (int i=0; i<A.length; i++) {
	            max = Math.max(max, A[i]);
	            maxPrefix[i] = max;
	        }

	         max = 0;

	         for (int i=A.length-1; i>=0; i--) {
	            max = Math.max(max, A[i]);
	            maxSuffix[i] = max;
	        }

	        int ans = 0;

	        for (int j=1; j<A.length-1; j++) {
	            int x = Math.min(maxPrefix[j-1], maxSuffix[j+1]) - A[j];
	            if (x > 0) {
	                ans = ans + x;
	            }
	            
	        }

	        return ans;

	    }

}
