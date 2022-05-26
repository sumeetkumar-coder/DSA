package com.sumeet.dsa.recursion;

public class Solution59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = solve(835576);
		System.out.println(x);

	}
	
	 public static int solve(int A) {

	        int x = sum(A);
	        System.out.println(x);
	        if (x == 1 ) {
	            return 1;
	        } else if (x < 10) {
	            return 0;
	        } 

	        return solve(x);

	    }

	     public static int sum(int A) {

	        if (A == 0) {
	            return 0;
	        }

	        int rem = (A % 10);
	        A = A/10;
	        
	        return rem + sum(A);
	    }

}
