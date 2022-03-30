package com.sumeet.dsa.mod;

/*
 * You are given a large number in the form of a string A where each character denotes a digit of the number.
	You are also given a number B. You have to find out the value of A % B and return it.
 * 
 * Approach
 * 
 * Since (a*b)%M = ((a%M) * (b*M))% M
 * (a+b)%M = ((a%M) + (b%M))%M
 * 
 * Num = 6237
 * 
 * 6237 % 8 = ((6000 % 8) + (200 % 8) + (30 % 8) + (7 % 8)) % 8
 * 
 * => (6000 % 8) = ((6 % 8) * (1000 * 8)) % 8
 */

public class Solution8 {

	public static void main(String[] args) {

		System.out.println(findMod("6237",8));

	}
	
	 public static int findMod(String A, int B) {

	        long res  = 0; 
	        long x = 1;
	        long mod = B;

	        for (int i=A.length()-1; i>=0; i--) {

	            long digit = A.charAt(i) - 48;
	            long y = (digit*x) % mod;
	            res = (res+y)% mod;
	            x = (x*10) % mod;
	           
	        }

	        return (int)res;

	    }

}
