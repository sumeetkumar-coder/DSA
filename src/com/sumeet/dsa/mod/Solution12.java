package com.sumeet.dsa.mod;

/*
 * 
 * LCM of two nos
 * 
 */

public class Solution12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LCM(12,15));
	}
	
	 public static int LCM(int A, int B) {

	        int lcm = (A>B) ? A : B;

	        while (true) {
	            if (lcm % A == 0 && lcm %B ==0) {
	                break;
	            }

	            ++lcm;

	        }

	        return lcm;
	    }

}
