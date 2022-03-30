package com.sumeet.dsa.bit.manipulation;

import java.util.Arrays;

public class Solution11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,1,3};
		int[] res = repeatedNumber(A);
		System.out.println(Arrays.toString(res));
	}
	
	 public static int[] repeatedNumber(final int[] A) {

	       int[] result = new int[2];
	      
	        for (int i=0; i<A.length; i++) {
	            int value = Math.abs(A[i]);
	           
	            if ( A[value-1] > 0) {
	                A[value-1] =  -A[value-1];
	            } else {
	                result[0] = value;
	            }
	        }

	        for (int i=0; i< A.length; i++) {
	            if (A[i] > 0) {
	                 result[1] = i+1;
	            }
	        }

	        return result;
	    }
}
