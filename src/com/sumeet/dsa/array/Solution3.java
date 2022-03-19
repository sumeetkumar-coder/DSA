package com.sumeet.dsa.array;

import java.util.Arrays;

public class Solution3 {

	public static void main(String[] args) {

		//approach 1
		
		char[] arr = new char[26];
		
		for(char i='a'; i<='z' ; i++) {
			
			arr[i-'a'] = i;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		//approach 2
		
		char[] c1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
	}

}
