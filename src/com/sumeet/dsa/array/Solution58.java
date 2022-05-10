package com.sumeet.dsa.array;

public class Solution58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int solve(int[] A) {

	        int max = Integer.MIN_VALUE;

	        for (int i=0; i<A.length; i++) {
	            if (A[i] > max) {
	                max = A[i];
	            }
	        }


	        boolean[] arr = new boolean[max+1];
	        arr[0] = true;
	        arr[1] = true;

	        for (int i=2; i*i < arr.length; i++) {

	            if (!arr[i]) {
	                for (int j=i*i; j< arr.length; j = j+i) {
	                    arr[j] = true;
	                }

	            }
	            

	        }

	        int countPrime = 0;
	        for (int k=0; k<A.length; k++) {

	            if (!arr[A[k]]) {
	                countPrime++;
	            }

	        }

	       long ans = 1;
	        for(int i = 1; i <= countPrime; i++) {
	            ans = (ans * 2) % 1000000007;
	        }
	        ans = ans - 1;
	        if(ans < 0) {
	            ans = ans + 1000000007;
	        }
	        return (int)ans;
	    }

}
