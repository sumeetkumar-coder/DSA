package com.sumeet.dsa.array;

public class Solution53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solve(int[][] A) {

        int n = A.length;
        int m = A[0].length;
        int sum = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j <m ; j++) {
                sum = sum + (i+1)*(n-i)*(j+1)*(m-j)*A[i][j];
            }
        }
        
        return sum;
	}
	

}
