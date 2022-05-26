package com.sumeet.dsa.recursion;

public class Solution60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int pow(int A, int B, int C) {

	        long y = 1L;

	        if (A == 0) {
	            return 0;
	        }
	        if (B == 0) {
	            return 1;
	        }

	        if ((B & 1) == 0) {

	            y = pow(A, B/2, C);
	            y = ((y % C) * (y % C)) % C;

	        } else {
	            y = A % C;
	            y = (y * (pow(A, B-1, C) % C)) % C; 

	        }

	        if (y < 0) {
	            y = y+C;
	        }   

	        return (int)y;

	    }

}
