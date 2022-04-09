package com.sumeet.dsa.bit.manipulation;

import java.util.Arrays;

/*
 * "Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once."

 * 
 * 
 */

public class Solution18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,7,7,3,2,4};
		System.out.println(Arrays.toString(solve(a)));

	}
	
	 public static int[] solve(int[] A) {
		 
		 int[] res = new int[2];
		 int xor = 0;
		 
		 for (int i=0; i<A.length; i++){
			 xor = xor ^ A[i];
		 }
		 
		 //find LSB of xor value
		 
		 int LSB = xor & (-xor);
		 
		 int x = 0;
		 int y = 0;
		 
		 for (int i=0; i<A.length; i++) {
			 if ((A[i] & LSB) == 1) {
				 x = x ^ A[i];
			 } else {
				 y = y ^ A[i];
			 }
		 }
		 
		 res[0] = x;
		 res[1] = y;
		 
		 return res;
	 }

}
