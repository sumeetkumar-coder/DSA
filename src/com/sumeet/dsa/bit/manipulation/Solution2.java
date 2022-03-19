package com.sumeet.dsa.bit.manipulation;

public class Solution2 {

	public static void main(String[] args) {
		
		int[] a = {23,24,23,5,24};
		System.out.println(singleNumber(a));
	}

	
	 public static int singleNumber(final int[] A) {

	        int result = 0;

	        for (int i=0; i<A.length; i++) {
	            result = result ^ A[i];
	        }

	        return result;
	    }
}
