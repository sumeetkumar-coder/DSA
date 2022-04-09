package com.sumeet.dsa.array;

public class Solution32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(new int[]{5, 9, 10, 4, 7, 8}, new int[]{5, 6, 4, 7, 2, 5}));
	}
	
	 public static int solve(int[] A, int[] B) {

	        long ans = Integer.MAX_VALUE;

	        for (int q=1; q<A.length-1; q++) {

	            int minP = Integer.MAX_VALUE;
	            for (int p=0; p<q; p++) {
	                if (B[p] < minP && A[p]<A[q]) {
	                    minP = B[p];
	                }
	            }

	            int minR = Integer.MAX_VALUE;
	            for (int r=q+1; r<A.length; r++) {
	                if (B[r] < minR && A[r]>A[q]) {
	                    minR = B[r];
	                }
	            }

	            long sum = minP + 0L +B[q] + 0L + minR;
	            System.out.println(sum);

	            if (sum < ans) {
	                ans = sum;
	            }


	        }

	        if (ans >= Integer.MAX_VALUE) {
	            return -1;
	        }


	        return (int)ans;
	        
	    }

}
