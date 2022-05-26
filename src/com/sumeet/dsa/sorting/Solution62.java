package com.sumeet.dsa.sorting;

import java.util.Arrays;

public class Solution62 {

	// TC : O(n^2)
	// SC : O(1)
	
	public static void main(String[] args) {
		
		int[] a = {7,8,3,1,2};
		System.out.println(Arrays.toString(insertSort(a)));

	}
	
	public static int[] insertSort(int[] arr) {
		
		
		for (int i=1; i<arr.length; i++) {
			
			int x = arr[i];
			
			int j = i;
			
			while (j >0 && arr[j] < arr[j-1]) {
				arr[j] = arr[j-1];
				arr[j-1] = x;
				j--;
			}
			
		}
		
		
		return arr;
	}

}
