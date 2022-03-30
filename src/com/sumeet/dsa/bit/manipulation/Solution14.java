package com.sumeet.dsa.bit.manipulation;

/*
 * Eight integers A, B, C, D, E, F, G, and H represent two rectangles in a 2D plane.
For the first rectangle, its bottom left corner is (A, B), and the top right corner is (C, D), and for the second rectangle, its bottom left corner is (E, F), and the top right corner is (G, H).

Find and return whether the two rectangles overlap or not.
 * 
 */

public class Solution14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	 public static int solve(int A, int B, int C, int D, int E, int F, int G, int H) {

	        int result = 1;

	        if (E>=C || A>=G || F>=D || B>=H) {
	            result = 0;
	        }

	        return result;
	    }

}
