package com.sumeet.dsa.sorting;

import java.util.Arrays;

public class Solution63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {7,8,3,1,2};
		System.out.println(Arrays.toString(selectionSort(a)));

	}
	
	public static int[] selectionSort(int[] arr) {
		
		for (int i=0; i<arr.length; i++) {
			
			int smallest = i;
			
			for (int j=i+1; j< arr.length; j++) {
				if (arr[j] < arr[smallest]) {
					smallest = j;
				}
			}
			
			// swap
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			
			
		}
		
		
		return arr;
	}

}
