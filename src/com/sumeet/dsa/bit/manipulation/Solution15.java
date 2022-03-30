package com.sumeet.dsa.bit.manipulation;

/*
 * Given an array B of length A with elements 1 or 0. Find the number of subarrays with bitwise OR 1. 
 * 
 * 
 */

public class Solution15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static long solve(int A, int[] B) {

	        long res = 0;
	        int last = -1;

	        for (int i=0; i<A; i++) {
	            if (B[i] == 1) {
	                res = res + (i+1);
	                last = i;
	            } else if(last != -1) {
	                 res = res + last+1;
	            }
	        }

	        return res;

	    }

}
