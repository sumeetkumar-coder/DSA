package com.sumeet.dsa.array;

public class Solution52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int firstMissingPositive(int[] A) {

	        int i = 0;
	        while (i != A.length) {

	            if ((A[i] == i+1) || A[i]<=0 || A[i] > A.length || A[i] == A[A[i]-1]) {
	                i++;
	                continue;
	            }

	             int temp = A[i];
	            A[i] = A[temp-1];
	            A[temp-1] = temp;

	        }

	        for (int j=0; j<A.length; j++) {
	            if (A[j] != j+1) {
	                return j+1;
	            }
	        }

	        return A.length+1;
	    }

}
