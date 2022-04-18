package com.sumeet.dsa.subSequence;

public class Solution48 {

	public static void main(String[] args) {
		

	}
	
	 public int solve(int[] A, int B) {

	        int n = 1<<A.length;

	        for (int i=0; i<n; i++) {

	            int sum = 0;
	            for (int j=0; j<A.length; j++) {
	                if ((i & (1<<j)) > 0) {
	                    sum += A[j];
	                }
	            }

	            if (sum == B) {
	                return 1;
	            }

	        }

	        return 0;
	    }

}
