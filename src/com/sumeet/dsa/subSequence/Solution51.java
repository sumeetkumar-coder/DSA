package com.sumeet.dsa.subSequence;

import java.util.Arrays;

public class Solution51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(new int[]{5,4,2}));
	}
	
	 public static int solve(int[] A) {


	        double mod = Math.pow(10,9) + 7;

	        Arrays.sort(A);

	        long maxSum = 0;
	        for (int i=0; i<A.length; i++) {
	            maxSum = maxSum + (((1<<i) * A[i]));
	        }

	         for (int j=0,k=A.length-1; j<A.length/2; j++,k--) {
	        	 int temp = A[j];
	        	 A[j] = A[k];
	        	 A[k] = temp;
	         }

	        long minSum = 0;
	        for (int i=0; i<A.length; i++) {
	            minSum = minSum + (((1<<i) * A[i]));
	        }

	        int x = (int) ((maxSum-minSum)%mod);

	        return x;
	    }

}
