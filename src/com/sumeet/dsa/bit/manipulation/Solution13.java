package com.sumeet.dsa.bit.manipulation;

/*
 * Find no of set bits in an integer
 * 
 * 
 */

public class Solution13 {

	public static void main(String[] args) {
		
		int x = 10;
		int count = 0;
		
		while (x> 0) {
			
			if ((x & 1) == 1) {
				count++;
			}
			
			x = x>>1;
			
		}
		
		System.out.println("No of set bits: " + count);
		

	}

}
