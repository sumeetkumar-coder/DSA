package com.sumeet.dsa.mod;

public class Solution56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(pow(-1,1,20));

	}
	
	 public static int pow(int A, int B, int C) {

	       int res = 1;

	        if (A == 0) {
	           return 0;
	       }

	       A = (A % C);

	       if (A == 0) {
	           return 0;
	       }

	       while (B > 0) {
	           if ((B & 1) != 0) {
	               res = (int)((res * 1L * (A%C)) % C);
	           }

	           A = (int)(((A%C) * 1L * (A%C)) % C);
	           B = (B >> 1);
	       }

	       if (res < 0) {
	           res = res + C;
	       }

	       return res;
	    }
}
