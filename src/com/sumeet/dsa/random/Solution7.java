package com.sumeet.dsa.random;

/*
 * Given an even no , find if sum of any two distinct prime is equal to that no
 * 
 * 
 */

public class Solution7 {

	public static void main(String[] args) {

		int x = 12;
		int result = -1;
		
		for (int i=2; i<x; i++) {
			if (isPrime(i) && isPrime(x-i)) {
				result = 1;
			}
		}
		
		System.out.println(result);
		
	}
	
	public static boolean isPrime(int num) {
		
		if (num == 1) {
			return false;
		}
		
		for (int i=2; i*i<num ; i++) {
			
			if (num % i == 0) {
				return false;
			}
			
		}
		
		return true;
	}

}
