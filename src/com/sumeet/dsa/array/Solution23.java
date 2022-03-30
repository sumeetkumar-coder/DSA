package com.sumeet.dsa.array;

/*
 * Kadane's Algorithm
 * 
 * Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
 */

public class Solution23 {

	public static void main(String[] args) {
		

	}
	
	 public int maxSubArray(final int[] A) {

	        int currentSum = 0;
	        int totalSum = Integer.MIN_VALUE;

	        for (int i=0; i<A.length; i++) {

	            if (currentSum >= 0) {
	                currentSum += A[i];
	            } else {
	                currentSum = A[i];
	            }

	            if (currentSum > totalSum) {
	                totalSum = currentSum;
	            }

	        }

	        return totalSum;
	      

	    }


}
