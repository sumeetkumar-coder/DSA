package com.sumeet.dsa.bit.manipulation;

public class Solution6 {

	public static void main(String[] args) {
		
		int x = solve(3);
		System.out.println(x);

	}
	
	 public static int solve(int A) {

	        int x = 1;
	        int ans = 0;

	        while (A > 0) {
	             x = x * 5;
	             if ((A % 2) == 1) {
	                 ans = ans + x;
	             }
	             A = A/2;
	        }

	        return ans;
	    }

}
