package com.sumeet.dsa.recursion;

public class Solution31 {

	public static void main(String[] args) {

		Solution31 s = new Solution31();
		
		System.out.println(s.solve(83557));

	}
	
	  public int solve(int A) {

	        if (A < 10) {
	            if (A == 1) {
	                return 1;
	            } else {
	                 return 0;
	            }
	        }

	        int x = add(A);
	      
	        return solve(x);

	    }


	     public int add(int A) {
	       
	        if (A == 0) {
	            return 0;
	        }

	        int rem = A % 10;

	        return rem + add(A/10);

	    }

}
