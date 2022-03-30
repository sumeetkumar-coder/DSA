package com.sumeet.dsa.bit.manipulation;

public class Solution16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public static long solve(long A, int B) {

	        long C = 0;
	        C = ~C;
	        C = C<<B;

	        return A&C;
	    }
}
