package com.sumeet.dsa.random;

import java.util.ArrayList;
import java.util.List;

/*
 * Find no of factors of given no
 * 
 * 
 */

public class Solution10 {

	public static void main(String[] args) {

		int x =10;
		
		List<Integer> l = new ArrayList<Integer>();
		
		for (int i=1; i*i<=x; i++) {
			
			if (x%i == 0) {
				if (x/i == i) {
					l.add(i);
				} else {
					l.add(i);
					l.add(x/i);
				}
				
			}
			
		}
		
		System.out.println(l.toString());
		

	}

}
