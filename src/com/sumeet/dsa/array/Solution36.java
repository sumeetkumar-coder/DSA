package com.sumeet.dsa.array;

public class Solution36 {

	public static void main(String[] args) {

		System.out.println(solve(new int[]{1,1,1}));

	}
	
	public static int solve(int[] A) {
		
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i=0; i<A.length; i++) {
			if ((A[i] & 1) == 1) {
				oddSum += A[i];
			} else {
				evenSum += A[i];
			}
		}
		
		int currentEvenSum = 0;
		int currentOddSum = 0;
		
		int res = 0;
		
		for (int i=0; i<A.length; i++) {
			
			int totalOdd = 0;
			int totalEven = 0;
			
			if ((A[i] & 1) == 1) {
				currentOddSum +=  A[i];
			} else {
				currentEvenSum += A[i];
				
			}
			totalOdd = currentOddSum + evenSum - currentEvenSum;
			totalEven = currentEvenSum + oddSum - currentOddSum;
			
			System.out.println("i" + i + "totalOdd:" + totalOdd + "totalEven" + totalEven);
			
			if ((A[i] & 1) == 1) {
				totalEven = totalEven - A[i];
			} else {
				totalOdd = totalOdd - A[i];
			}
			
			if (totalEven == totalOdd) {
				res++;
			}
		}
		
		
		return res;
	}

}
